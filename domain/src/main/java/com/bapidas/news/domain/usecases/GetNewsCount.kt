package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.NewsRepository

class GetNewsCount(private val repository: NewsRepository) {
    suspend operator fun invoke() =
        repository.getNewsCount()
}