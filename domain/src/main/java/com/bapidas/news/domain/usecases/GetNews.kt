package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.NewsRepository

class GetNews(private val repository: NewsRepository) {
    suspend operator fun invoke(local: Boolean, requestedLoadSize: Int) =
        repository.getNews(local = local, requestedLoadSize = requestedLoadSize)
}