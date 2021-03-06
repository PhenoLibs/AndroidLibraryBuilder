package org.wheatgenetics.androidlibrary.mstrdtl;

/**
 * Uses:
 * android.view.LayoutInflater
 * android.view.View.OnClickListener
 * android.view.ViewGroup
 *
 * androidx.annotation.IntRange
 * androidx.annotation.NonNull
 * androidx.annotation.RestrictTo
 * androidx.annotation.RestrictTo.Scope
 * androidx.recyclerview.widget.RecyclerView.Adapter
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.androidlibrary.R
 *
 * org.wheatgenetics.androidlibrary.mstrdtl.ViewHolder
 */
abstract class Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<
org.wheatgenetics.androidlibrary.mstrdtl.ViewHolder>
{
    @androidx.annotation.NonNull private final org.wheatgenetics.javalib.mstrdtl.Items items;

    // region Package Methods
    @androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.SUBCLASSES)
    abstract android.view.View.OnClickListener makeOnClickListener(@androidx.annotation.IntRange(
    from = org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION) final int position);

    @androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.SUBCLASSES)
    @androidx.annotation.NonNull org.wheatgenetics.javalib.mstrdtl.Items getItems()
    { return this.items; }
    // endregion

    Adapter(@androidx.annotation.NonNull final org.wheatgenetics.javalib.mstrdtl.Items items)
    { super(); this.items = items; }

    // region Overridden Methods
    @java.lang.Override @androidx.annotation.NonNull
    public org.wheatgenetics.androidlibrary.mstrdtl.ViewHolder onCreateViewHolder(
    @androidx.annotation.NonNull final android.view.ViewGroup parent, final int viewType)
    {
        return new org.wheatgenetics.androidlibrary.mstrdtl.ViewHolder(
            android.view.LayoutInflater.from(parent.getContext()).inflate(
                org.wheatgenetics.androidlibrary.R.layout.mstrdtl_list_item,
                parent, /* attachToRoot => */false));
    }

    @java.lang.Override public void onBindViewHolder(@androidx.annotation.NonNull
    final org.wheatgenetics.androidlibrary.mstrdtl.ViewHolder viewHolder,
    final int                                                 position  )
    {
        viewHolder.bind(
            /* item            => */ this.getItems().get     (position)                    ,
            /* onClickListener => */ this.makeOnClickListener(position) /* polymorphism */);
    }

    @java.lang.Override public int getItemCount() { return this.getItems().size(); }
    // endregion
}