package com.bapidas.news.framework.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.bapidas.news.framework.db.entity.NewsLocal

@Dao
interface IRoomNewsDao : IRoomBaseDao<NewsLocal> {
    @Query("SELECT * FROM news ORDER BY publish_at ASC limit :requestedLoadSize")
    suspend fun news(requestedLoadSize: Int): List<NewsLocal>

    @Query("SELECT * FROM news WHERE publish_at > :key ORDER BY publish_at ASC limit :requestedLoadSize")
    suspend fun newsAfter(requestedLoadSize: Int, key: String): List<NewsLocal>

    @Query("SELECT COUNT(publish_at) FROM news")
    suspend fun getNewsCount(): Int

    @Query("DELETE FROM news")
    suspend fun clearNews(): Int
}