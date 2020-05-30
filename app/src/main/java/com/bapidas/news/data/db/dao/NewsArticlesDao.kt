package com.bapidas.news.data.db.dao

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query
import com.bapidas.news.data.db.model.ArticleEntity

@Dao
interface NewsArticlesDao : BaseDao<ArticleEntity> {
    @Query("SELECT * FROM tbl_article")
    fun getNewsArticles(): DataSource.Factory<Int, ArticleEntity>

    @Query("SELECT COUNT(publishedAt) FROM tbl_article")
    fun getNewsArticlesCount(): Int
}