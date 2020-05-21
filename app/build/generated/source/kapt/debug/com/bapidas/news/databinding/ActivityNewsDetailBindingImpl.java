package com.bapidas.news.databinding;
import com.bapidas.news.R;
import com.bapidas.news.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNewsDetailBindingImpl extends ActivityNewsDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 6);
        sViewsWithIds.put(R.id.img_back, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNewsDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityNewsDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.imgBg.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDate.setTag(null);
        this.tvDescription.setTag(null);
        this.tvSource.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((com.bapidas.news.ui.main.news.detail.NewsDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.bapidas.news.ui.main.news.detail.NewsDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelArticle((androidx.lifecycle.MutableLiveData<com.bapidas.news.ui.model.Article>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelArticle(androidx.lifecycle.MutableLiveData<com.bapidas.news.ui.model.Article> ViewModelArticle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        androidx.lifecycle.MutableLiveData<com.bapidas.news.ui.model.Article> viewModelArticle = null;
        java.lang.String viewModelArticleDateString = null;
        com.bapidas.news.ui.model.Article viewModelArticleGetValue = null;
        java.lang.String viewModelArticleTitle = null;
        java.lang.String viewModelArticleDescription = null;
        java.lang.String viewModelArticleUrlToImage = null;
        com.bapidas.news.ui.main.news.detail.NewsDetailViewModel viewModel = mViewModel;
        java.lang.String viewModelArticleSourceName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.article
                    viewModelArticle = viewModel.getArticle();
                }
                updateLiveDataRegistration(0, viewModelArticle);


                if (viewModelArticle != null) {
                    // read viewModel.article.getValue()
                    viewModelArticleGetValue = viewModelArticle.getValue();
                }


                if (viewModelArticleGetValue != null) {
                    // read viewModel.article.getValue().dateString
                    viewModelArticleDateString = viewModelArticleGetValue.getDateString();
                    // read viewModel.article.getValue().title
                    viewModelArticleTitle = viewModelArticleGetValue.getTitle();
                    // read viewModel.article.getValue().description
                    viewModelArticleDescription = viewModelArticleGetValue.getDescription();
                    // read viewModel.article.getValue().urlToImage
                    viewModelArticleUrlToImage = viewModelArticleGetValue.getUrlToImage();
                    // read viewModel.article.getValue().sourceName
                    viewModelArticleSourceName = viewModelArticleGetValue.getSourceName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.bapidas.news.common.extensions.ImageViewExtensionKt.setImage(this.imgBg, viewModelArticleUrlToImage, (android.graphics.drawable.Drawable)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewModelArticleDateString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescription, viewModelArticleDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSource, viewModelArticleSourceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelArticleTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.article
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}