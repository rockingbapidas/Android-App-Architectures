package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.INewsRepository
import javax.inject.Inject

class GetNewsAfter @Inject constructor(private val repository: INewsRepository) {
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