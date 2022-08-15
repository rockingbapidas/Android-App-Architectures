package com.bapidas.news.data

import com.bapidas.news.data.repository.NewsRepositoryImpl
import com.bapidas.news.domain.INewsRepository
import dagger.Binds
import dagger.Module

@Module(includes = [DataModuleExt::class])
class DataModule

@Module
interface DataModuleExt {
    @Binds
    fun bindNewsRepository(newsRepository: NewsRepositoryImpl): INewsRepository
}