package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.INewsRepository
import javax.inject.Inject

class GetNews @Inject constructor(private val repository: INewsRepository) {
    suspend operator fun invoke(local: Boolean, requestedLoadSize: Int) =
        repository.getNews(local = local, requestedLoadSize = requestedLoadSize)
}