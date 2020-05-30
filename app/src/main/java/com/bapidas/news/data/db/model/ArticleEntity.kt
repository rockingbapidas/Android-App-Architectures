package com.bapidas.news.data.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tbl_article")
class ArticleEntity(
    @PrimaryKey
    @SerializedName("publishedAt")
    val publishedAt: String,
    val title: String? = null,
    val description: String? = null,
    val urlToImage: String? = null,
    val sourceName: String? = null
)