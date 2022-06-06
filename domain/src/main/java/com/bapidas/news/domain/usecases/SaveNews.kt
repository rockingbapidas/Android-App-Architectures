package com.bapidas.news.domain.usecases

import com.bapidas.news.domain.NewsRepository
import com.bapidas.news.domain.model.NewsListDomain

class SaveNews(private val repository: NewsRepository) {
    suspend operator fun invoke(newsListDomain: NewsListDomain) =
        repository.saveNews(newsListDomain)
}