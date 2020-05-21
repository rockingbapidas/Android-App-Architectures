package com.bapidas.news.ui.main.news.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/bapidas/news/ui/main/news/detail/NewsDetailsActivity;", "Lcom/bapidas/news/ui/base/activity/BaseToolbarActivity;", "Lcom/bapidas/news/databinding/ActivityNewsDetailBinding;", "Lcom/bapidas/news/ui/main/news/detail/NewsDetailViewModel;", "()V", "layoutViewRes", "", "getLayoutViewRes", "()I", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "onBackPressed", "", "onViewCreated", "onViewModelCreated", "Companion", "newsapp-v1.0.0(1)_debug"})
public final class NewsDetailsActivity extends com.bapidas.news.ui.base.activity.BaseToolbarActivity<com.bapidas.news.databinding.ActivityNewsDetailBinding, com.bapidas.news.ui.main.news.detail.NewsDetailViewModel> {
    private final int layoutViewRes = com.bapidas.news.R.layout.activity_news_detail;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<com.bapidas.news.ui.main.news.detail.NewsDetailViewModel> viewModelClass = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEWS_EXTRA_DATA = "newExtra";
    public static final com.bapidas.news.ui.main.news.detail.NewsDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutViewRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<com.bapidas.news.ui.main.news.detail.NewsDetailViewModel> getViewModelClass() {
        return null;
    }
    
    @java.lang.Override()
    protected void onViewModelCreated() {
    }
    
    @java.lang.Override()
    protected void onViewCreated() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public NewsDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/bapidas/news/ui/main/news/detail/NewsDetailsActivity$Companion;", "", "()V", "NEWS_EXTRA_DATA", "", "open", "", "parent", "Landroid/view/View;", "article", "Lcom/bapidas/news/ui/model/Article;", "fromActivity", "Landroid/app/Activity;", "newsapp-v1.0.0(1)_debug"})
    public static final class Companion {
        
        public final void open(@org.jetbrains.annotations.NotNull()
        android.view.View parent, @org.jetbrains.annotations.NotNull()
        com.bapidas.news.ui.model.Article article, @org.jetbrains.annotations.NotNull()
        android.app.Activity fromActivity) {
        }
        
        private Companion() {
            super();
        }
    }
}