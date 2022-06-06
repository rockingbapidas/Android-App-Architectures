package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.NewsRepository

class ClearNews(private val repository: NewsRepository) {
    suspend operator fun invoke() = repository.clearNews()
}