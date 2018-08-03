package org.wheatgenetics.androidlibrary;

/**
 * Uses:
 * android.app.Activity
 * android.content.DialogInterface.OnClickListener
 * android.support.annotation.Size
 *
 * org.wheatgenetics.androidlibrary.AlertDialog
 */
@java.lang.SuppressWarnings({"WeakerAccess"})
public abstract class ItemsAlertDialog extends org.wheatgenetics.androidlibrary.AlertDialog
{
    private android.content.DialogInterface.OnClickListener onClickListener;

    @java.lang.SuppressWarnings({"unused"})
    public ItemsAlertDialog(final android.app.Activity activity) { super(activity); }

    // region Public Methods
    @java.lang.SuppressWarnings({"unused"}) public void setOnClickListener(
    final android.content.DialogInterface.OnClickListener onClickListener)
    { this.onClickListener = onClickListener; }

    @java.lang.SuppressWarnings({"unused"})
    public void show(@android.support.annotation.Size(min = 1) final java.lang.String items[])
    { if (null != items) { this.setItems(items, this.onClickListener); this.createShow(); } }

    @java.lang.SuppressWarnings({"unused"})
    public void show(@android.support.annotation.Size(min = 1) final int items[])
    { if (null != items) { this.setItems(items, this.onClickListener); this.createShow(); } }
    // endregion
}