package com.bapidas.news.framework.network.entity

import com.google.gson.annotations.SerializedName

data class NewsList(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("articles")
    val articles: List<News>
)

data class News(
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("author")
    val author: String? = null,
    @SerializedName("content")
    val content: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("source")
    val source: Source? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("urlToImage")
    val urlToImage: String? = null
)

data class Source(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null
)