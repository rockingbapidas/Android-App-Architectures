package com.bapidas.news.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH\u0016J\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020 H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/bapidas/news/data/repository/NewsRepositoryImpl;", "Lcom/bapidas/news/data/repository/NewsRepository;", "mNewsApi", "Lcom/bapidas/news/data/remote/api/NewsApi;", "mNewsArticlesDao", "Lcom/bapidas/news/data/db/dao/NewsArticlesDao;", "(Lcom/bapidas/news/data/remote/api/NewsApi;Lcom/bapidas/news/data/db/dao/NewsArticlesDao;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "loadedNewsArticle", "", "getLoadedNewsArticle", "()I", "setLoadedNewsArticle", "(I)V", "mNewsBoundaryCallback", "Lcom/bapidas/news/data/repository/NewsBoundaryCallback;", "getMNewsBoundaryCallback", "()Lcom/bapidas/news/data/repository/NewsBoundaryCallback;", "mNewsBoundaryCallback$delegate", "totalNewsArticle", "getTotalNewsArticle", "setTotalNewsArticle", "getNewsArticles", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/bapidas/news/ui/model/Article;", "loadNewsArticles", "", "page", "latestLoad", "", "onCleared", "Companion", "newsapp-v1.0.0(1)_debug"})
public final class NewsRepositoryImpl implements com.bapidas.news.data.repository.NewsRepository {
    private final kotlin.Lazy compositeDisposable$delegate = null;
    private final kotlin.Lazy mNewsBoundaryCallback$delegate = null;
    private int totalNewsArticle;
    private int loadedNewsArticle;
    private final com.bapidas.news.data.remote.api.NewsApi mNewsApi = null;
    private final com.bapidas.news.data.db.dao.NewsArticlesDao mNewsArticlesDao = null;
    public static final int INITIAL_PAGE = 1;
    public static final int PAGE_SIZE = 20;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY = "business";
    public static final com.bapidas.news.data.repository.NewsRepositoryImpl.Companion Companion = null;
    
    private final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    private final com.bapidas.news.data.repository.NewsBoundaryCallback getMNewsBoundaryCallback() {
        return null;
    }
    
    public final int getTotalNewsArticle() {
        return 0;
    }
    
    public final void setTotalNewsArticle(int p0) {
    }
    
    public final int getLoadedNewsArticle() {
        return 0;
    }
    
    public final void setLoadedNewsArticle(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.bapidas.news.ui.model.Article>> getNewsArticles() {
        return null;
    }
    
    @java.lang.Override()
    public void onCleared() {
    }
    
    public final void loadNewsArticles(int page, boolean latestLoad) {
    }
    
    public final void loadNewsArticles() {
    }
    
    public NewsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.data.remote.api.NewsApi mNewsApi, @org.jetbrains.annotations.NotNull()
    com.bapidas.news.data.db.dao.NewsArticlesDao mNewsArticlesDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/bapidas/news/data/repository/NewsRepositoryImpl$Companion;", "", "()V", "CATEGORY", "", "INITIAL_PAGE", "", "PAGE_SIZE", "newsapp-v1.0.0(1)_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}