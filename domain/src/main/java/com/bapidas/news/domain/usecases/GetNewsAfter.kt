package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.NewsRepository

class GetNewsAfter(private val repository: NewsRepository) {
    suspend operator fun invoke(
        local: Boolean,
        requestedLoadSize: Int,
        page: Int,
        key: String
    ) =
        repository.getNewsAfter(
            local = local,
            requestedLoadSize = requestedLoadSize,
            page = page,
            key = key
        )
}