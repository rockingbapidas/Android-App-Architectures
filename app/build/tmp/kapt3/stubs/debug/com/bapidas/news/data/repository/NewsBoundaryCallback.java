package com.bapidas.news.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/bapidas/news/data/repository/NewsBoundaryCallback;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/bapidas/news/ui/model/Article;", "mNewsRepository", "Lcom/bapidas/news/data/repository/NewsRepositoryImpl;", "(Lcom/bapidas/news/data/repository/NewsRepositoryImpl;)V", "latestLoad", "", "onItemAtEndLoaded", "", "itemAtEnd", "onItemAtFrontLoaded", "itemAtFront", "onZeroItemsLoaded", "newsapp-v1.0.0(1)_debug"})
public final class NewsBoundaryCallback extends androidx.paging.PagedList.BoundaryCallback<com.bapidas.news.ui.model.Article> {
    private boolean latestLoad;
    private final com.bapidas.news.data.repository.NewsRepositoryImpl mNewsRepository = null;
    
    @java.lang.Override()
    public void onZeroItemsLoaded() {
    }
    
    @java.lang.Override()
    public void onItemAtFrontLoaded(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.ui.model.Article itemAtFront) {
    }
    
    @java.lang.Override()
    public void onItemAtEndLoaded(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.ui.model.Article itemAtEnd) {
    }
    
    public NewsBoundaryCallback(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.data.repository.NewsRepositoryImpl mNewsRepository) {
        super();
    }
}