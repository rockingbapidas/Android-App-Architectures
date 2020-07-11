package com.bapidas.news.data.repository

import androidx.paging.DataSource
import com.bapidas.news.BuildConfig
import com.bapidas.news.data.db.dao.NewsArticlesDao
import com.bapidas.news.data.db.model.ArticleEntity
import com.bapidas.news.data.mapper.toArticle
import com.bapidas.news.data.mapper.toArticleEntity
import com.bapidas.news.data.network.api.NewsApi
import com.bapidas.news.data.network.model.News
import com.bapidas.news.data.network.response.NewsListResponse
import com.bapidas.news.ui.model.Article
import io.reactivex.Single
import timber.log.Timber

class NewsRepositoryImpl constructor(
    private val mNewsApi: NewsApi,
    private val mNewsArticlesDao: NewsArticlesDao
) : NewsRepository {

    override fun getNewsArticles(): DataSource.Factory<Int, Article> {
        return mNewsArticlesDao.getNewsArticles().map{it.toArticle()}
    }

    override fun getNewsArticle(id: String): Article {
        return mNewsArticlesDao.getNewsArticle(id).toArticle()
    }

    override fun getNewsArticleTotalCount(): Int {
        return mNewsArticlesDao.getNewsArticlesCount()
    }

    override fun deleteNewsArticle(article: Article) {
        mNewsArticlesDao.delete(article.toArticleEntity())
    }

    override fun deleteNewsArticles(articles: List<Article>) {
        mNewsArticlesDao.delete(articles.map { it.toArticleEntity() })
    }

    override fun saveNewsArticles(articles: List<News>) {
        mNewsArticlesDao.insert(articles.map { it.toArticleEntity() })
    }

    override fun saveNewsArticle(article: News) {
        mNewsArticlesDao.insert(article.toArticleEntity())
    }

    override fun fetchNewsFromRemote(page: Int): Single<NewsListResponse> {
        return mNewsApi.getNewsArticles(CATEGORY, PAGE_SIZE, page, BuildConfig.API_KEY)
    }

    companion object {
        const val INITIAL_PAGE = 1
        const val PAGE_SIZE = 20
        const val CATEGORY = "business"
    }
}