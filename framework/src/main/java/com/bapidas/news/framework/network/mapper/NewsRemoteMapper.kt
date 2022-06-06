package com.bapidas.news.framework.network.mapper

import com.bapidas.news.data.model.NewsEntity
import com.bapidas.news.data.model.NewsListEntity
import com.bapidas.news.data.model.SourceEntity
import com.bapidas.news.framework.network.entity.News
import com.bapidas.news.framework.network.entity.NewsList
import com.bapidas.news.framework.network.entity.Source

fun NewsListEntity.toNewsList(): NewsList {
    return NewsList(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.toNews() }
    )
}

fun NewsList.fromNewsList(): NewsListEntity {
    return NewsListEntity(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.fromNews() }
    )
}

fun NewsEntity.toNews(): News {
    return News(
        publishedAt = publishedAt,
        title = title,
        description = description,
        urlToImage = urlToImage,
        url = url,
        author = author,
        content = content,
        source = source?.toSource()
    )
}

fun News.fromNews(): NewsEntity {
    return NewsEntity(
        publishedAt = publishedAt,
        title = title,
        description = description,
        urlToImage = urlToImage,
        url = url,
        author = author,
        content = content,
        source = source?.fromSource()
    )
}

fun SourceEntity.toSource(): Source {
    return Source(
        id = id,
        name = name
    )
}

fun Source.fromSource(): SourceEntity {
    return SourceEntity(
        id = id,
        name = name
    )
}