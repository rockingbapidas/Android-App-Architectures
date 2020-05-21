package com.bapidas.news.databinding;
import com.bapidas.news.R;
import com.bapidas.news.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNewsBindingImpl extends ItemNewsBinding implements com.bapidas.news.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[5]
            );
        this.cardNews.setTag(null);
        this.imgBg.setTag(null);
        this.tvDate.setTag(null);
        this.tvSource.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.bapidas.news.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.bapidas.news.ui.model.Article) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.bapidas.news.ui.base.adapter.callback.ItemViewListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.bapidas.news.ui.model.Article Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.bapidas.news.ui.base.adapter.callback.ItemViewListener Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemSourceName = null;
        com.bapidas.news.ui.model.Article item = mItem;
        java.lang.String itemTitle = null;
        java.lang.String itemUrlToImage = null;
        com.bapidas.news.ui.base.adapter.callback.ItemViewListener callback = mCallback;
        java.lang.String itemDateString = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.sourceName
                    itemSourceName = item.getSourceName();
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.urlToImage
                    itemUrlToImage = item.getUrlToImage();
                    // read item.dateString
                    itemDateString = item.getDateString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cardNews.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.bapidas.news.common.extensions.ImageViewExtensionKt.setImage(this.imgBg, itemUrlToImage, (android.graphics.drawable.Drawable)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, itemDateString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSource, itemSourceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, itemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.bapidas.news.ui.model.Article item = mItem;
        // callback
        com.bapidas.news.ui.base.adapter.callback.ItemViewListener callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {




            callback.onItemClick(callbackArg_0, item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}