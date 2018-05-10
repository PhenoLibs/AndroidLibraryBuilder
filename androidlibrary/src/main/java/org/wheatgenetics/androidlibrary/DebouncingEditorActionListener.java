package org.wheatgenetics.androidlibrary;

/**
 * When Ruban barcode scanners are in automatic mode and the user scans barcodes quickly the scanner
 * sometimes produces truncated/incorrect text.  This class decreases the occurrence of this problem
 * by building in a delay.
 *
 * Uses:
 * android.os.Handler
 * android.support.annotation.IntRange
 * android.support.annotation.RestrictTo
 * android.support.annotation.RestrictTo.Scope
 * android.util.Log
 * android.widget.EditText
 *
 * org.wheatgenetics.androidlibrary.EditorActionListener
 * org.wheatgenetics.androidlibrary.EditorActionListener.Receiver
 */
public class DebouncingEditorActionListener
extends org.wheatgenetics.androidlibrary.EditorActionListener
{
    @java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
    private static class TextAccumulator extends java.lang.Object
    {
        // region Fields
        private final org.wheatgenetics.androidlibrary.EditorActionListener.Receiver receiver   ;
        private final boolean                                                        debug      ;
        private final long                                                           delayMillis;

        private boolean accumulating = false;
        @java.lang.SuppressWarnings({"Convert2Diamond"})
        private final java.util.ArrayList<java.lang.String> arrayList =
            new java.util.ArrayList<java.lang.String>();
        private final java.lang.Runnable runnable = new java.lang.Runnable()
        {
            @java.lang.Override public void run()
            {
                org.wheatgenetics.androidlibrary.DebouncingEditorActionListener
                    .TextAccumulator.this.stop();
            }
        };
        private final android.os.Handler handler = new android.os.Handler();
        // endregion

        private void stop()
        {
            this.accumulating = false;

            if (this.debug)
            {
                final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                {
                    boolean firstText = true;
                    for (final java.lang.String text: this.arrayList)
                    {
                        if (firstText) firstText = false; else stringBuilder.append(", ");
                        stringBuilder.append(text);
                    }
                }
                android.util.Log.d("EditorActionListener", stringBuilder.toString());
            }

            if (null != this.receiver)
                this.receiver.receiveText(this.arrayList.get(this.arrayList.size() - 1));
        }

        private TextAccumulator(
        final org.wheatgenetics.androidlibrary.EditorActionListener.Receiver receiver,
        final boolean debug, final long delayMillis)
        { super(); this.receiver = receiver; this.debug = debug; this.delayMillis = delayMillis; }

        private void accumulate(final java.lang.String text)
        {
            if (!this.accumulating)
            {
                this.arrayList.clear();
                this.accumulating = true;
                this.handler.postDelayed(this.runnable, /* delayMillis => */ this.delayMillis);
            }
            this.arrayList.add(text);
        }
    }

    private final org.wheatgenetics.androidlibrary.DebouncingEditorActionListener.TextAccumulator
        textAccumulator;

    public DebouncingEditorActionListener(final android.widget.EditText editText,
    final org.wheatgenetics.androidlibrary.EditorActionListener.Receiver receiver,
    final boolean debug, @android.support.annotation.IntRange(from = 0) final long delayMillis)
    {
        super(editText, receiver, debug);
        this.textAccumulator =
            new org.wheatgenetics.androidlibrary.DebouncingEditorActionListener.TextAccumulator(
                receiver, debug, delayMillis);
    }

    @java.lang.Override
    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected void sendText(final java.lang.String text) { this.textAccumulator.accumulate(text); }
}