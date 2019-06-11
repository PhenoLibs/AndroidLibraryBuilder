package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * android.app.Application
 * android.support.annotation.NonNull
 * android.support.annotation.RestrictTo
 * android.support.annotation.RestrictTo.Scope
 *
 * io.swagger.client.model.StudyLayoutRequestLayout
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.ItemsProvider
 *
 * org.wheatgenetics.androidlibrary.mstrdtl.ItemFragment.GetterChanger
 * org.wheatgenetics.androidlibrary.mstrdtl.ListActivity
 * org.wheatgenetics.androidlibrary.mstrdtl.OnePaneAdapter
 *
 * org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestLayoutAlertDialog
 * org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestLayoutAlertDialog.Handler
 * org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestLayoutOnePaneAdapter
 */
public class StudyLayoutRequestListActivity
extends org.wheatgenetics.androidlibrary.mstrdtl.ListActivity
implements org.wheatgenetics.androidlibrary.mstrdtl.ItemFragment.GetterChanger
{
    // region Fields
    private org.wheatgenetics.javalib.mstrdtl.Items itemsInstance = null;               // lazy load
    private org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestLayoutAlertDialog
        studyLayoutRequestLayoutAlertDialogInstance = null;                             // lazy load
    // endregion

    private org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestLayoutAlertDialog
    studyLayoutRequestLayoutAlertDialog()
    {
        if (null == this.studyLayoutRequestLayoutAlertDialogInstance)
            this.studyLayoutRequestLayoutAlertDialogInstance =
                new org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestLayoutAlertDialog(
                    this, new
                    org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestLayoutAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestListActivity
                                .this.refreshSinceItemHasChanged();
                        }
                    });
        return this.studyLayoutRequestLayoutAlertDialogInstance;
    }

    // region Overridden Methods
    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    @java.lang.Override protected org.wheatgenetics.javalib.mstrdtl.Items items()
    {
        if (null == this.itemsInstance)
        {
            final android.app.Application application = this.getApplication();
            if (application instanceof org.wheatgenetics.javalib.mstrdtl.ItemsProvider)
                this.itemsInstance =
                    ((org.wheatgenetics.javalib.mstrdtl.ItemsProvider) application).mstrdtlItems();
        }
        return this.itemsInstance;
    }

    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    @java.lang.Override
    protected org.wheatgenetics.androidlibrary.mstrdtl.OnePaneAdapter makeOnePaneAdapter()
    {
        return new org.wheatgenetics.brapi1_3.studies.StudyLayoutRequestLayoutOnePaneAdapter(
            this.items());
    }

    // region org.wheatgenetics.androidlibrary.mstrdtl.ItemFragment.GetterChanger Overridden Method
    @java.lang.Override public void change(
    @android.support.annotation.NonNull org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        this.studyLayoutRequestLayoutAlertDialog().show(
            (io.swagger.client.model.StudyLayoutRequestLayout) item);
    }
    // endregion
    // endregion
}