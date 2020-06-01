package com.bapidas.news.data.repository

import androidx.paging.DataSource
import com.bapidas.news.data.network.model.News
import com.bapidas.news.data.network.remote.response.NewsListResponse
import com.bapidas.news.ui.model.Article
import io.reactivex.Single

interface NewsRepository {
    fun getNewsArticles(): DataSource.Factory<Int, Article>

    fun getNewsArticle(id: String): Article

    fun getNewsArticleTotalCount(): Int

    fun deleteNewsArticle(id: String)

    fun saveNewsArticles(articles: List<News>)

    fun saveNewsArticle(articles: News)

    fun fetchNewsFromRemote(page: Int): Single<NewsListResponse>
}