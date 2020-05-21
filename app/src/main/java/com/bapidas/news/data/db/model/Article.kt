package com.bapidas.news.data.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity
class Article(
    @PrimaryKey
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("urlToImage")
    val urlToImage: String? = null,
    @SerializedName("source")
    val sourceName: String? = null
) : Serializable {
    val dateString
        get() = publishedAt.split("T").getOrElse(0) { "" }
}