package org.wheatgenetics.androidlibrarybuilder.mstrdtl;

/**
 * Uses:
 * androidx.annotation.NonNull
 * androidx.annotation.RestrictTo
 * androidx.annotation.RestrictTo.Scope
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 * org.wheatgenetics.javalib.mstrdtl.TestItems
 *
 * org.wheatgenetics.androidlibrary.mstrdtl.ChangeableItemActivity
 *
 * org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeItemAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeItemAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeableListActivity
 */
public class ChangeableItemActivity
extends org.wheatgenetics.androidlibrary.mstrdtl.ChangeableItemActivity
{
    // region Fields
    private org.wheatgenetics.javalib.mstrdtl.Items               itemsInstance = null; // lazy load
    private org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeItemAlertDialog
        changeItemAlertDialogInstance = null;                                           // lazy load
    // endregion

    private org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeItemAlertDialog
    changeItemAlertDialog()
    {
        if (null == this.changeItemAlertDialogInstance) this.changeItemAlertDialogInstance =
            new org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeItemAlertDialog(this,
                new org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeItemAlertDialog.Handler()
                {
                    @java.lang.Override public void handleChangeItemDone()
                    {
                        org.wheatgenetics.androidlibrarybuilder.mstrdtl
                            .ChangeableItemActivity.this.refreshSinceItemHasChanged();
                    }
                });
        return this.changeItemAlertDialogInstance;
    }

    // region Overridden Methods
    @androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.SUBCLASSES)
    @java.lang.Override @androidx.annotation.NonNull
    protected org.wheatgenetics.javalib.mstrdtl.Items items()
    {
        if (null == this.itemsInstance) this.itemsInstance =
            new org.wheatgenetics.javalib.mstrdtl.TestItems().fromJson(this.getJson());
        return this.itemsInstance;
    }

    @androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.SUBCLASSES)
    @java.lang.Override protected java.lang.Class listActivityClass()
    { return org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeableListActivity.class; }

    @java.lang.Override public void change(
    @androidx.annotation.NonNull final org.wheatgenetics.javalib.mstrdtl.Item item)
    { this.changeItemAlertDialog().show((org.wheatgenetics.javalib.mstrdtl.TestItem) item); }
    // endregion
}