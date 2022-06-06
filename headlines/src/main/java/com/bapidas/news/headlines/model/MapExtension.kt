package com.bapidas.news.headlines.model

import com.bapidas.news.domain.model.NewsDomain
import com.bapidas.news.domain.model.NewsListDomain

fun NewsDomain.mapToArticle(): Article {
    return Article(
        publishedAt = publishedAt,
        title = title,
        description = description,
        urlToImage = urlToImage,
        url = url,
        sourceName = source?.name
    )
}

fun NewsListDomain.mapToArticle(): List<Article> {
    return articles.map { it.mapToArticle() }
}