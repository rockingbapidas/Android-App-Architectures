package com.bapidas.news.data.mapper

import com.bapidas.news.data.db.model.ArticleEntity
import com.bapidas.news.data.network.model.News
import com.bapidas.news.ui.model.Article


fun ArticleEntity.toArticle(): Article {
    return Article(
        publishedAt,
        title,
        description,
        urlToImage,
        url,
        sourceName
    )
}

fun Article.toArticleEntity(): ArticleEntity {
    return ArticleEntity(
        publishedAt,
        title,
        description,
        urlToImage,
        url,
        sourceName
    )
}

fun News.toArticleEntity(): ArticleEntity {
    return ArticleEntity(
        publishedAt,
        title,
        description,
        urlToImage,
        url,
        source?.name
    )
}

fun News.toArticle(): Article {
    return Article(
        publishedAt,
        title,
        description,
        urlToImage,
        url,
        source?.name
    )
}