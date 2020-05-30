package com.bapidas.news.data.network.remote.api

import com.bapidas.news.common.network.Urls
import com.bapidas.news.data.network.remote.response.NewsListResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET(Urls.News.ARTICLES_API)
    fun getNewsArticles(
        @Query("q") category: String,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String
    ): Single<NewsListResponse>
}