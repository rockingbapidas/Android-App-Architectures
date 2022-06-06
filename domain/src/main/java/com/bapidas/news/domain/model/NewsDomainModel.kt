package com.bapidas.news.domain.model

data class NewsListDomain(
    val status: String,
    val totalResults: Int,
    val articles: List<NewsDomain>
)

data class NewsDomain(
    val publishedAt: String,
    val author: String? = null,
    val content: String? = null,
    val description: String? = null,
    val source: SourceDomain? = null,
    val title: String? = null,
    val url: String? = null,
    val urlToImage: String? = null
)

data class SourceDomain(
    val id: String? = null,
    val name: String? = null
)