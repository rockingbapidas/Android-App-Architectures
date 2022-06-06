package com.bapidas.news.data.model

data class NewsListEntity(
    val status: String,
    val totalResults: Int,
    val articles: List<NewsEntity>
)

data class NewsEntity(
    val publishedAt: String,
    val author: String? = null,
    val content: String? = null,
    val description: String? = null,
    val source: SourceEntity? = null,
    val title: String? = null,
    val url: String? = null,
    val urlToImage: String? = null
)

data class SourceEntity(
    val id: String? = null,
    val name: String? = null
)