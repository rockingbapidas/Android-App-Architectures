package com.bapidas.news.ui.main.news.listing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0014R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/bapidas/news/ui/main/news/listing/NewsViewModel;", "Lcom/bapidas/news/ui/base/viewmodel/BaseActivityViewModel;", "mNewsRepository", "Lcom/bapidas/news/data/repository/NewsRepository;", "(Lcom/bapidas/news/data/repository/NewsRepository;)V", "isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "newsArticles", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/bapidas/news/ui/model/Article;", "getNewsArticles", "()Landroidx/lifecycle/LiveData;", "newsArticles$delegate", "Lkotlin/Lazy;", "onCleared", "", "newsapp-v1.0.0(1)_debug"})
@com.bapidas.news.di.scope.ActivityScope()
public final class NewsViewModel extends com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy newsArticles$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    private final com.bapidas.news.data.repository.NewsRepository mNewsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.bapidas.news.ui.model.Article>> getNewsArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.data.repository.NewsRepository mNewsRepository) {
        super();
    }
}