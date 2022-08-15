package com.bapidas.news.data.repository

import com.bapidas.news.data.factory.NewsDataStoreFactory
import com.bapidas.news.data.mapper.fromNewsListEntity
import com.bapidas.news.data.mapper.toNewsListEntity
import com.bapidas.news.domain.INewsRepository
import com.bapidas.news.domain.model.NewsListDomain
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val mNewsDataStoreFactory: NewsDataStoreFactory) :
    INewsRepository {
    private var totalNewsArticle = 0
    private var loadedNewsArticle = 0

    override suspend fun getNews(local: Boolean, requestedLoadSize: Int): NewsListDomain {
        val store = mNewsDataStoreFactory.retrieveDataStore(local)
        return if (local) {
            val newData = mNewsDataStoreFactory.retrieveRemoteDataStore().getNews(requestedLoadSize)
            if (newData.articles.isNotEmpty()) {
                store.saveNews(newData)
            }
            totalNewsArticle = mNewsDataStoreFactory.retrieveLocalDataStore().getNewsCount()
            loadedNewsArticle += requestedLoadSize
            store.getNews(requestedLoadSize).fromNewsListEntity()
        } else {
            val newData = store.getNews(requestedLoadSize)
            if (newData.articles.isNotEmpty()) {
                totalNewsArticle = newData.totalResults
                loadedNewsArticle += requestedLoadSize
                return newData.fromNewsListEntity()
            }
            throw Exception("No Data")
        }
    }

    override suspend fun getNewsAfter(
        local: Boolean,
        requestedLoadSize: Int,
        page: Int,
        key: String
    ): NewsListDomain {
        val store = mNewsDataStoreFactory.retrieveDataStore(local)
        val isItemPending = loadedNewsArticle < totalNewsArticle
        return if (local) {
            if (isItemPending) {
                loadedNewsArticle += requestedLoadSize
                store.getNewsAfter(
                    requestedLoadSize = requestedLoadSize,
                    key = key,
                    page = 0
                ).fromNewsListEntity()
            } else {
                val nextPage = loadedNewsArticle.div(requestedLoadSize).plus(1)
                val newData = mNewsDataStoreFactory.retrieveRemoteDataStore().getNewsAfter(
                    requestedLoadSize = requestedLoadSize,
                    page = nextPage,
                    key = ""
                )
                if (newData.articles.isNotEmpty()) {
                    store.saveNews(newData)
                    loadedNewsArticle += requestedLoadSize
                    totalNewsArticle = mNewsDataStoreFactory.retrieveLocalDataStore().getNewsCount()
                    return store.getNewsAfter(
                        requestedLoadSize = requestedLoadSize,
                        key = key,
                        page = 0
                    ).fromNewsListEntity()
                }
                throw Exception("No Data")
            }
        } else {
            if (isItemPending) {
                val nextPage = loadedNewsArticle.div(requestedLoadSize).plus(1)
                val newData = store.getNewsAfter(
                    requestedLoadSize = requestedLoadSize,
                    page = nextPage,
                    key = key
                )
                if (newData.articles.isNotEmpty()) {
                    loadedNewsArticle += requestedLoadSize
                }
                return newData.fromNewsListEntity()
            }
            throw Exception("No Data")
        }
    }

    override suspend fun getNewsCount(): Int {
        return mNewsDataStoreFactory.retrieveLocalDataStore().getNewsCount()
    }

    override suspend fun saveNews(news: NewsListDomain): List<Long> {
        return mNewsDataStoreFactory.retrieveLocalDataStore().saveNews(news.toNewsListEntity())
    }

    override suspend fun clearNews(): Int {
        return mNewsDataStoreFactory.retrieveLocalDataStore().clearNews()
    }
}