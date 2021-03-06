package org.wheatgenetics.brapi1_3;

/**
 * Uses:
 * android.app.Activity
 *
 * androidx.annotation.NonNull
 * androidx.annotation.RestrictTo
 * androidx.annotation.RestrictTo.Scope
 *
 * org.wheatgenetics.androidlibrary.ItemsAlertDialog
 */
public abstract class TypeAlertDialog extends org.wheatgenetics.androidlibrary.ItemsAlertDialog
{
    @java.lang.SuppressWarnings({"CStyleArrayDeclaration"})
    private java.lang.String itemsInstance[] = null;

    // region Protected Methods
    /** Used by subclasses. */
    @androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.SUBCLASSES)
    protected boolean itemsIsNull() { return null == this.itemsInstance; }

    /** Used by subclasses. */
    @androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.SUBCLASSES)
    protected void createItems(
    @androidx.annotation.NonNull final java.util.ArrayList<java.lang.String> arrayList)
    {
        if (this.itemsIsNull())
        {
            this.itemsInstance = new java.lang.String[arrayList.size()];
            this.itemsInstance = arrayList.toArray(this.itemsInstance);
        }
    }

    /** Overridden by subclasses. */
    @androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.SUBCLASSES)
    protected java.lang.String[] items() { return this.itemsInstance; }
    // endregion

    @java.lang.SuppressWarnings({"WeakerAccess", "RedundantSuppression"})
    public TypeAlertDialog(final android.app.Activity activity) { super(activity); }

    // region Overridden Methods
    @java.lang.Override public void configure() { this.setCancelNegativeButton()            ; }
    @java.lang.Override public void show     () { this.show(this.items() /* polymorphism */); }
    // endregion
}