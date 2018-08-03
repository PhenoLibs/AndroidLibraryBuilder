package org.wheatgenetics.androidlibrary;

/**
 * Uses:
 * android.support.annotation.RestrictTo
 * android.support.annotation.RestrictTo.Scope
 * android.widget.EditText
 *
 * org.wheatgenetics.androidlibrary.EditorActionListener
 * org.wheatgenetics.androidlibrary.EditorActionListener.Receiver
 */
@java.lang.SuppressWarnings({"WeakerAccess"})
public class ClearingEditorActionListener
extends org.wheatgenetics.androidlibrary.EditorActionListener
{
    @java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier", "WeakerAccess"})
    public interface Receiver extends org.wheatgenetics.androidlibrary.EditorActionListener.Receiver
    { public abstract void clearText(); }

    @java.lang.SuppressWarnings({"WeakerAccess"})
    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected void clearText()
    {
        final org.wheatgenetics.androidlibrary.ClearingEditorActionListener.Receiver receiver =
            (org.wheatgenetics.androidlibrary.ClearingEditorActionListener.Receiver)
                this.getReceiver();
        assert null != receiver; receiver.clearText();
    }

    @java.lang.SuppressWarnings({"unused"}) public ClearingEditorActionListener(
    final android.widget.EditText                                                editText,
    final org.wheatgenetics.androidlibrary.ClearingEditorActionListener.Receiver receiver,
    final boolean debug) { super(editText, receiver, debug); }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override
    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    protected void process(final java.lang.String text)
    {
        this.clearEditTextText();
        if (org.wheatgenetics.androidlibrary.EditorActionListener.isEmpty(text))
            this.clearText();
        else
            this.sendText(text);
    }
}