package com.bapidas.news.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/bapidas/news/data/repository/NewsRepository;", "", "getNewsArticles", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/bapidas/news/ui/model/Article;", "onCleared", "", "newsapp-v1.0.0(1)_debug"})
public abstract interface NewsRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<androidx.paging.PagedList<com.bapidas.news.ui.model.Article>> getNewsArticles();
    
    public abstract void onCleared();
}