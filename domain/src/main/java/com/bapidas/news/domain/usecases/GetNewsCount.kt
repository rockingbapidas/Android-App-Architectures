package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.INewsRepository
import javax.inject.Inject

class GetNewsCount @Inject constructor(private val repository: INewsRepository) {
    suspend operator fun invoke() =
        repository.getNewsCount()
}