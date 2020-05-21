package com.bapidas.news.databinding;
import com.bapidas.news.R;
import com.bapidas.news.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNewsBindingImpl extends ActivityNewsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.tv_title, 5);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.layoutShimmer.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvNews.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.bapidas.news.ui.main.news.listing.NewsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.bapidas.news.ui.main.news.listing.NewsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelNewsArticles((androidx.lifecycle.LiveData<androidx.paging.PagedList<com.bapidas.news.ui.model.Article>>) object, fieldId);
            case 1 :
                return onChangeViewModelIsLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelNewsArticles(androidx.lifecycle.LiveData<androidx.paging.PagedList<com.bapidas.news.ui.model.Article>> ViewModelNewsArticles, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        boolean viewModelNewsArticlesIsEmpty = false;
        androidx.paging.PagedList<com.bapidas.news.ui.model.Article> viewModelNewsArticlesGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        boolean viewModelIsLoadingViewModelNewsArticlesIsEmptyBooleanFalse = false;
        androidx.lifecycle.LiveData<androidx.paging.PagedList<com.bapidas.news.ui.model.Article>> viewModelNewsArticles = null;
        boolean ViewModelNewsArticlesIsEmpty1 = false;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        boolean ViewModelIsLoadingViewModelNewsArticlesIsEmptyBooleanFalse1 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoading = null;
        com.bapidas.news.ui.main.news.listing.NewsViewModel viewModel = mViewModel;
        boolean ViewModelIsLoading1 = false;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewModel != null) {
                    // read viewModel.isLoading
                    viewModelIsLoading = viewModel.isLoading();
                }
                updateLiveDataRegistration(1, viewModelIsLoading);


                if (viewModelIsLoading != null) {
                    // read viewModel.isLoading.getValue()
                    viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
            if((dirtyFlags & 0xfL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                ViewModelIsLoading1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue;
            if((dirtyFlags & 0xfL) != 0) {
                if(ViewModelIsLoading1) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xa0L) != 0) {

                if (viewModel != null) {
                    // read viewModel.newsArticles
                    viewModelNewsArticles = viewModel.getNewsArticles();
                }
                updateLiveDataRegistration(0, viewModelNewsArticles);


                if (viewModelNewsArticles != null) {
                    // read viewModel.newsArticles.getValue()
                    viewModelNewsArticlesGetValue = viewModelNewsArticles.getValue();
                }


                if (viewModelNewsArticlesGetValue != null) {
                    // read viewModel.newsArticles.getValue().isEmpty()
                    viewModelNewsArticlesIsEmpty = viewModelNewsArticlesGetValue.isEmpty();
                }

            if ((dirtyFlags & 0x20L) != 0) {

                    // read !viewModel.newsArticles.getValue().isEmpty()
                    ViewModelNewsArticlesIsEmpty1 = !viewModelNewsArticlesIsEmpty;
            }
        }

        if ((dirtyFlags & 0xfL) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !viewModel.newsArticles.getValue().isEmpty() : false
                viewModelIsLoadingViewModelNewsArticlesIsEmptyBooleanFalse = ((ViewModelIsLoading1) ? (ViewModelNewsArticlesIsEmpty1) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? viewModel.newsArticles.getValue().isEmpty() : false
                ViewModelIsLoadingViewModelNewsArticlesIsEmptyBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (viewModelNewsArticlesIsEmpty) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.bapidas.news.common.extensions.ViewExtensionKt.setVisibility(this.layoutShimmer, ViewModelIsLoadingViewModelNewsArticlesIsEmptyBooleanFalse1);
            com.bapidas.news.common.extensions.ViewExtensionKt.setVisibility(this.rvNews, viewModelIsLoadingViewModelNewsArticlesIsEmptyBooleanFalse);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.newsArticles
        flag 1 (0x2L): viewModel.isLoading
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !viewModel.newsArticles.getValue().isEmpty() : false
        flag 5 (0x6L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !viewModel.newsArticles.getValue().isEmpty() : false
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? viewModel.newsArticles.getValue().isEmpty() : false
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? viewModel.newsArticles.getValue().isEmpty() : false
    flag mapping end*/
    //end
}