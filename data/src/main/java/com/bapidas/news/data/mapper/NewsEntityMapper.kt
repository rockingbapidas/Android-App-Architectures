package com.bapidas.news.data.mapper

import com.bapidas.news.data.model.NewsEntity
import com.bapidas.news.data.model.NewsListEntity
import com.bapidas.news.data.model.SourceEntity
import com.bapidas.news.domain.model.NewsDomain
import com.bapidas.news.domain.model.NewsListDomain
import com.bapidas.news.domain.model.SourceDomain

fun NewsListDomain.toNewsListEntity(): NewsListEntity {
    return NewsListEntity(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.toNewsEntity() }
    )
}

fun NewsListEntity.fromNewsListEntity(): NewsListDomain {
    return NewsListDomain(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.fromNewsEntity() }
    )
}

fun NewsDomain.toNewsEntity(): NewsEntity {
    return NewsEntity(
        publishedAt = publishedAt,
        title = title,
        description = description,
        urlToImage = urlToImage,
        url = url,
        author = author,
        content = content,
        source = source?.toSourceEntity()
    )
}

fun NewsEntity.fromNewsEntity(): NewsDomain {
    return NewsDomain(
        publishedAt = publishedAt,
        title = title,
        description = description,
        urlToImage = urlToImage,
        url = url,
        author = author,
        content = content,
        source = source?.fromSourceEntity()
    )
}

fun SourceDomain.toSourceEntity(): SourceEntity {
    return SourceEntity(
        id = id,
        name = name
    )
}

fun SourceEntity.fromSourceEntity(): SourceDomain {
    return SourceDomain(
        id = id,
        name = name
    )
}

