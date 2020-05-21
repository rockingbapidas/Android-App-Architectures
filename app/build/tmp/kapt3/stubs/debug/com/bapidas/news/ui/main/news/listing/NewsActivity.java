package com.bapidas.news.ui.main.news.listing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/bapidas/news/ui/main/news/listing/NewsActivity;", "Lcom/bapidas/news/ui/base/activity/BaseToolbarActivity;", "Lcom/bapidas/news/databinding/ActivityNewsBinding;", "Lcom/bapidas/news/ui/main/news/listing/NewsViewModel;", "Lcom/bapidas/news/ui/base/adapter/callback/ItemViewListener;", "()V", "layoutViewRes", "", "getLayoutViewRes", "()I", "newsAdapter", "Lcom/bapidas/news/ui/main/news/listing/adapter/NewsAdapter;", "getNewsAdapter", "()Lcom/bapidas/news/ui/main/news/listing/adapter/NewsAdapter;", "newsAdapter$delegate", "Lkotlin/Lazy;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "onItemClick", "", "view", "Landroid/view/View;", "object", "", "onViewCreated", "onViewModelCreated", "Companion", "newsapp-v1.0.0(1)_debug"})
public final class NewsActivity extends com.bapidas.news.ui.base.activity.BaseToolbarActivity<com.bapidas.news.databinding.ActivityNewsBinding, com.bapidas.news.ui.main.news.listing.NewsViewModel> implements com.bapidas.news.ui.base.adapter.callback.ItemViewListener {
    private final int layoutViewRes = com.bapidas.news.R.layout.activity_news;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<com.bapidas.news.ui.main.news.listing.NewsViewModel> viewModelClass = null;
    private final kotlin.Lazy newsAdapter$delegate = null;
    public static final com.bapidas.news.ui.main.news.listing.NewsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutViewRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<com.bapidas.news.ui.main.news.listing.NewsViewModel> getViewModelClass() {
        return null;
    }
    
    private final com.bapidas.news.ui.main.news.listing.adapter.NewsAdapter getNewsAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onViewModelCreated() {
    }
    
    @java.lang.Override()
    protected void onViewCreated() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    public NewsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/bapidas/news/ui/main/news/listing/NewsActivity$Companion;", "", "()V", "openClear", "", "fromActivity", "Landroid/app/Activity;", "newsapp-v1.0.0(1)_debug"})
    public static final class Companion {
        
        public final void openClear(@org.jetbrains.annotations.NotNull()
        android.app.Activity fromActivity) {
        }
        
        private Companion() {
            super();
        }
    }
}