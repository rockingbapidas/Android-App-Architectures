package com.bapidas.news.ui.model

import java.io.Serializable

class Article(
    val publishedAt: String,
    val title: String? = null,
    val description: String? = null,
    val urlToImage: String? = null,
    val sourceName: String? = null
) : Serializable {
    val dateString
        get() = publishedAt.split("T").getOrElse(0) { "" }
}