package com.bapidas.news.data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/bapidas/news/data/remote/api/NewsApi;", "", "getNewsArticles", "Lio/reactivex/Single;", "Lcom/bapidas/news/data/remote/response/NewsListResponse;", "category", "", "pageSize", "", "page", "apiKey", "newsapp-v1.0.0(1)_debug"})
public abstract interface NewsApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/v2/everything")
    public abstract io.reactivex.Single<com.bapidas.news.data.remote.response.NewsListResponse> getNewsArticles(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String category, @retrofit2.http.Query(value = "pageSize")
    int pageSize, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey);
}