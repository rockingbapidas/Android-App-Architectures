package com.bapidas.news.framework.db.repository

import com.bapidas.news.data.model.NewsListEntity
import com.bapidas.news.data.repository.INewsLocalRepository
import com.bapidas.news.framework.db.dao.IRoomNewsDao
import com.bapidas.news.framework.db.mapper.fromNewsLocal
import com.bapidas.news.framework.db.mapper.toNewsLocal
import javax.inject.Inject

class RoomNewsRepository @Inject constructor(private val roomNewsDao: IRoomNewsDao) :
    INewsLocalRepository {

    override suspend fun getNews(requestedLoadSize: Int): NewsListEntity {
        return roomNewsDao.news(requestedLoadSize).fromNewsLocal()
    }

    override suspend fun getNewsAfter(requestedLoadSize: Int, key: String): NewsListEntity {
        return roomNewsDao.newsAfter(requestedLoadSize, key).fromNewsLocal()
    }

    override suspend fun getNewsCount(): Int {
        return roomNewsDao.getNewsCount()
    }

    override suspend fun saveNews(newsListEntity: NewsListEntity): List<Long> {
        return roomNewsDao.insert(newsListEntity.toNewsLocal())
    }

    override suspend fun clearNews(): Int {
        return roomNewsDao.clearNews()
    }
}