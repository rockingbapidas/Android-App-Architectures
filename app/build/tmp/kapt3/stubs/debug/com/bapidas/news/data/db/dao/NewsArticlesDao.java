package com.bapidas.news.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\'J\b\u0010\u0006\u001a\u00020\u0005H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/bapidas/news/data/db/dao/NewsArticlesDao;", "Lcom/bapidas/news/data/db/dao/BaseDao;", "Lcom/bapidas/news/ui/model/Article;", "getNewsArticles", "Landroidx/paging/DataSource$Factory;", "", "getNewsArticlesCount", "newsapp-v1.0.0(1)_debug"})
public abstract interface NewsArticlesDao extends com.bapidas.news.data.db.dao.BaseDao<com.bapidas.news.ui.model.Article> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Article")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.bapidas.news.ui.model.Article> getNewsArticles();
    
    @androidx.room.Query(value = "SELECT COUNT(publishedAt) FROM Article")
    public abstract int getNewsArticlesCount();
}