package com.bapidas.news.data.db.dao

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query
import com.bapidas.news.data.db.model.ArticleEntity

@Dao
interface NewsArticlesDao : BaseDao<ArticleEntity> {
    @Query("SELECT * FROM tbl_article")
    fun getNewsArticles(): DataSource.Factory<Int, ArticleEntity>

    @Query("SELECT * FROM tbl_article WHERE publishedAt = :id")
    fun getNewsArticle(id: String): ArticleEntity

    @Query("DELETE FROM tbl_article WHERE publishedAt = :id")
    fun deleteNewsArticle(id: String)

    @Query("SELECT COUNT(publishedAt) FROM tbl_article")
    fun getNewsArticlesCount(): Int
}