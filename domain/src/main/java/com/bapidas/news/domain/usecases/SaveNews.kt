package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.INewsRepository
import com.bapidas.news.domain.model.NewsListDomain
import javax.inject.Inject

class SaveNews @Inject constructor(private val repository: INewsRepository) {
    suspend operator fun invoke(newsListDomain: NewsListDomain) =
        repository.saveNews(newsListDomain)
}