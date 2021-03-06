package org.wheatgenetics.brapi1_3.studies.nour.ot;              // nour: NewObservationUnitRequests

/**
 * Uses:
 * android.app.Activity
 * android.content.Intent
 *
 * androidx.annotation.NonNull
 *
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.androidlibrary.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatmentsListActivity
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class Utils extends java.lang.Object
{
    private static android.content.Intent TREATMENTS_LIST_INTENT_INSTANCE = null;       // lazy load

    private static android.content.Intent observationTreatmentsListIntent(
    final android.app.Activity activity, final org.wheatgenetics.javalib.mstrdtl.Items items)
    {
        if (null ==
        org.wheatgenetics.brapi1_3.studies.nour.ot.Utils.TREATMENTS_LIST_INTENT_INSTANCE)
            org.wheatgenetics.brapi1_3.studies.nour.ot.Utils.TREATMENTS_LIST_INTENT_INSTANCE =
                new android.content.Intent(activity, org.wheatgenetics.brapi1_3
                    .studies.nour.ot.ObservationTreatmentsListActivity.class);
        return org.wheatgenetics.androidlibrary.mstrdtl.Utils.putJsonIntoIntent(items,
            org.wheatgenetics.brapi1_3.studies.nour.ot.Utils.TREATMENTS_LIST_INTENT_INSTANCE);
    }

    public static void showObservationTreatmentsListActivity(
    @androidx.annotation.NonNull final android.app.Activity activity,
    final org.wheatgenetics.javalib.mstrdtl.Items items, final int requestCode)
    {
        activity.startActivityForResult(
            org.wheatgenetics.brapi1_3.studies.nour.ot.Utils.observationTreatmentsListIntent(
                activity, items),
            requestCode);
    }
}