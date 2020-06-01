package com.bapidas.news.data.repository

import androidx.paging.DataSource
import com.bapidas.news.BuildConfig
import com.bapidas.news.data.db.dao.NewsArticlesDao
import com.bapidas.news.data.db.model.ArticleEntity
import com.bapidas.news.data.network.model.News
import com.bapidas.news.data.network.remote.api.NewsApi
import com.bapidas.news.data.network.remote.response.NewsListResponse
import com.bapidas.news.ui.model.Article
import io.reactivex.Single
import timber.log.Timber

class NewsRepositoryImpl constructor(
    private val mNewsApi: NewsApi,
    private val mNewsArticlesDao: NewsArticlesDao
) : NewsRepository {

    override fun getNewsArticles(): DataSource.Factory<Int, Article> {
        Timber.v("getNewsArticles ")
        return mNewsArticlesDao.getNewsArticles()
            .map {
                Article(
                    it.publishedAt,
                    it.title,
                    it.description,
                    it.urlToImage,
                    it.sourceName
                )
            }
    }

    override fun getNewsArticle(id: String): Article {
        val articleEntity = mNewsArticlesDao.getNewsArticle(id)
        return articleEntity.run {
            Article(publishedAt, title, description, urlToImage, sourceName)
        }
    }

    override fun getNewsArticleTotalCount(): Int {
        return mNewsArticlesDao.getNewsArticlesCount()
    }

    override fun deleteNewsArticle(id: String) {
        mNewsArticlesDao.deleteNewsArticle(id)
    }

    override fun saveNewsArticles(articles: List<News>) {
        val article = articles
            .map {
                ArticleEntity(
                    it.publishedAt,
                    it.title,
                    it.description,
                    it.urlToImage,
                    it.source?.name
                )
            }
        mNewsArticlesDao.insert(article)
    }

    override fun saveNewsArticle(articles: News) {
        articles.run {
            mNewsArticlesDao.insert(
                ArticleEntity(
                    publishedAt,
                    title,
                    description,
                    urlToImage,
                    source?.name
                )
            )
        }
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