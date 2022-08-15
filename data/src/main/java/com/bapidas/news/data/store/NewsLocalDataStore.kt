package com.bapidas.news.data.store

import com.bapidas.news.data.model.NewsListEntity
import com.bapidas.news.data.repository.INewsLocalRepository
import javax.inject.Inject

class NewsLocalDataStore @Inject constructor(private val mNewsLocalRepository: INewsLocalRepository) :
    INewsDataStore {
    override suspend fun getNews(requestedLoadSize: Int): NewsListEntity {
        return mNewsLocalRepository.getNews(requestedLoadSize = requestedLoadSize)
    }

    override suspend fun getNewsAfter(
        requestedLoadSize: Int,
        page: Int,
        key: String
    ): NewsListEntity {
        return mNewsLocalRepository.getNewsAfter(requestedLoadSize = requestedLoadSize, key = key)
    }

    override suspend fun getNewsCount(): Int {
        return mNewsLocalRepository.getNewsCount()
    }

    override suspend fun saveNews(newsListEntity: NewsListEntity): List<Long> {
        return mNewsLocalRepository.saveNews(newsListEntity)
    }

    override suspend fun clearNews(): Int {
        return mNewsLocalRepository.clearNews()
    }
}