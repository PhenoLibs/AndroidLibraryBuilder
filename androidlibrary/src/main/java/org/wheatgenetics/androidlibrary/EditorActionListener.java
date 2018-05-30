package org.wheatgenetics.androidlibrary;

/**
 * This class 1) provides optional debug logging and 2) clears its editText's text when done.
 *
 * Uses:
 * android.support.annotation.RestrictTo
 * android.support.annotation.RestrictTo.Scope
 * android.util.Log
 * android.view.KeyEvent
 * android.view.inputmethod.EditorInfo
 * android.widget.EditText
 * android.widget.TextView
 * android.widget.TextView.OnEditorActionListener
 *
 * org.wheatgenetics.androidlibrary.Utils
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class EditorActionListener extends java.lang.Object
implements android.widget.TextView.OnEditorActionListener
{
    @java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"})
    public interface Receiver { public abstract void receiveText(java.lang.String text); }

    // region Fields
    private final android.widget.EditText                                        editText;
    private final org.wheatgenetics.androidlibrary.EditorActionListener.Receiver receiver;
    private final boolean                                                        debug   ;
    // endregion

    // region Protected Methods
    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected static int log(final java.lang.String msg)
    { return android.util.Log.d("EditorActionListener", msg); }

    @java.lang.SuppressWarnings({"SimplifiableConditionalExpression"})
    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected static boolean isEmpty(final java.lang.String text)
    { return null == text ? true : text.length() <= 0; }

    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected void clearEditTextText() { assert null != this.editText; this.editText.setText(""); }

    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected void sendText(final java.lang.String text)
    {
        if (this.debug) org.wheatgenetics.androidlibrary.EditorActionListener.log(text);
        assert null != this.receiver; this.receiver.receiveText(text);
    }

    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected void process(final java.lang.String text)
    {
        if (!org.wheatgenetics.androidlibrary.EditorActionListener.isEmpty(text))
            { this.clearEditTextText(); this.sendText(text); }
    }

    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected org.wheatgenetics.androidlibrary.EditorActionListener.Receiver getReceiver()
    { return this.receiver; }
    // endregion

    public EditorActionListener(final android.widget.EditText editText,
    final org.wheatgenetics.androidlibrary.EditorActionListener.Receiver receiver,
    final boolean debug)
    {
        super();

        this.editText = editText;
        assert null != this.editText; this.editText.setOnEditorActionListener(this);

        this.receiver = receiver; this.debug = debug;
    }

    @java.lang.Override public boolean onEditorAction(final android.widget.TextView v,
    final int actionId, final android.view.KeyEvent event)
    {
        if (this.debug)
        {
            final java.lang.StringBuilder stringBuilder =
                new java.lang.StringBuilder("actionId == ");
            switch (actionId)
            {
                case android.view.inputmethod.EditorInfo.IME_ACTION_NEXT:
                    stringBuilder.append("IME_ACTION_NEXT"); break;

                case android.view.inputmethod.EditorInfo.IME_ACTION_DONE:
                    stringBuilder.append("IME_ACTION_DONE"); break;

                case android.view.inputmethod.EditorInfo.IME_NULL:
                    stringBuilder.append("IME_NULL"); break;

                default: stringBuilder.append(actionId); break;
            }

            stringBuilder.append(", event == ");
            if (null != event) stringBuilder.append("not "); stringBuilder.append("null");

            if (android.view.inputmethod.EditorInfo.IME_NULL == actionId && null != event)
            {
                final int action = event.getAction();
                switch (action)
                {
                    case android.view.KeyEvent.ACTION_DOWN: case android.view.KeyEvent.ACTION_UP:
                        stringBuilder.append(", event.getAction() == ACTION_");
                        switch (action)
                        {
                            case android.view.KeyEvent.ACTION_DOWN:
                                stringBuilder.append("DOWN"); break;

                            case android.view.KeyEvent.ACTION_UP: stringBuilder.append("UP"); break;
                        }
                        break;
                }
            }

            org.wheatgenetics.androidlibrary.EditorActionListener.log(stringBuilder.toString());
        }

        switch (actionId)
        {
            case android.view.inputmethod.EditorInfo.IME_NULL:
                assert null != event;
                if (event.getAction() == android.view.KeyEvent.ACTION_DOWN) return true;
                // break statement is intentionally omitted here.

            case android.view.inputmethod.EditorInfo.IME_ACTION_DONE:
                this.process(org.wheatgenetics.androidlibrary.Utils.getText(this.editText));
                return true;

            default: return false;
        }
    }
}