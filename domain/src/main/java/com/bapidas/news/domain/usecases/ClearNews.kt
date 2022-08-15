package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.INewsRepository
import javax.inject.Inject

class ClearNews @Inject constructor(private val repository: INewsRepository) {
    suspend operator fun invoke() = repository.clearNews()
}