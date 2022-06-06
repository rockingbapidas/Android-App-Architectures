package com.bapidas.news.framework.db.mapper

import com.bapidas.news.data.model.NewsEntity
import com.bapidas.news.data.model.NewsListEntity
import com.bapidas.news.data.model.SourceEntity
import com.bapidas.news.framework.db.entity.NewsLocal

fun NewsListEntity.toNewsLocal(): List<NewsLocal> {
    return articles.map {
        NewsLocal(
            publishedAt = it.publishedAt,
            title = it.title,
            description = it.description,
            urlToImage = it.urlToImage,
            url = it.url,
            sourceName = it.source?.name
        )
    }
}

fun NewsEntity.toNewsLocal(): NewsLocal {
    return NewsLocal(
        publishedAt = publishedAt,
        title = title,
        description = description,
        urlToImage = urlToImage,
        url = url,
        sourceName = source?.name
    )
}

fun NewsLocal.fromNewsLocal(): NewsEntity {
    return NewsEntity(
        publishedAt = publishedAt,
        title = title,
        description = description,
        urlToImage = urlToImage,
        url = url,
        source = SourceEntity(name = sourceName)
    )
}

fun List<NewsLocal>.fromNewsLocal(): NewsListEntity {
    return NewsListEntity(
        status = "",
        totalResults = 0,
        articles = this.map { it.fromNewsLocal() }
    )
}