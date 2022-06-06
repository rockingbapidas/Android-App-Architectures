package com.bapidas.news.framework.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "news", indices = [Index(value = ["publish_at"], unique = true)])
data class NewsLocal(
    @PrimaryKey
    @ColumnInfo(name = "publish_at")
    val publishedAt: String,
    @ColumnInfo(name = "title")
    val title: String? = null,
    @ColumnInfo(name = "description")
    val description: String? = null,
    @ColumnInfo(name = "url_to_image")
    val urlToImage: String? = null,
    @ColumnInfo(name = "source_name")
    val sourceName: String? = null,
    @ColumnInfo(name = "url")
    val url: String? = null
)