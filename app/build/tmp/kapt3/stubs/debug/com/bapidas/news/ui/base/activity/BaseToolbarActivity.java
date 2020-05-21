package com.bapidas.news.ui.base.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014R\u001b\u0010\u0007\u001a\u00020\b8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/bapidas/news/ui/base/activity/BaseToolbarActivity;", "D", "Landroidx/databinding/ViewDataBinding;", "V", "Lcom/bapidas/news/ui/base/viewmodel/BaseActivityViewModel;", "Lcom/bapidas/news/ui/base/activity/BaseActivity;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable$newsapp_v1_0_0_1__debug", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "onStop", "", "newsapp-v1.0.0(1)_debug"})
public abstract class BaseToolbarActivity<D extends androidx.databinding.ViewDataBinding, V extends com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel> extends com.bapidas.news.ui.base.activity.BaseActivity<D, V> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy compositeDisposable$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable$newsapp_v1_0_0_1__debug() {
        return null;
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public BaseToolbarActivity() {
        super();
    }
}