package com.bapidas.news.data.db.dao

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query
import com.bapidas.news.ui.model.Article

@Dao
interface NewsArticlesDao : BaseDao<Article> {
    @Query("SELECT * FROM Article")
    fun getNewsArticles(): DataSource.Factory<Int, Article>

    @Query("SELECT COUNT(publishedAt) FROM Article")
    fun getNewsArticlesCount(): Int
}