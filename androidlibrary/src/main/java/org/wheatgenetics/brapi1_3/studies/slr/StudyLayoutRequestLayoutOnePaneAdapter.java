package org.wheatgenetics.brapi1_3.studies.slr;                           // slr: StudyLayoutRequest

/**
 * Uses:
 * androidx.annotation.RestrictTo
 * androidx.annotation.RestrictTo.Scope
 *
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.androidlibrary.mstrdtl.OnePaneAdapter
 *
 * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayoutItemActivity
 */
class StudyLayoutRequestLayoutOnePaneAdapter
extends org.wheatgenetics.androidlibrary.mstrdtl.OnePaneAdapter
{
    StudyLayoutRequestLayoutOnePaneAdapter(final org.wheatgenetics.javalib.mstrdtl.Items items)
    { super(items); }

    @androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.SUBCLASSES)
    @java.lang.Override protected java.lang.Class concreteItemActivityClass()
    { return org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayoutItemActivity.class; }
}