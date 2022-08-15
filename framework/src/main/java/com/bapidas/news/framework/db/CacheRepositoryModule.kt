package com.bapidas.news.framework.db

import com.bapidas.news.data.repository.INewsLocalRepository
import com.bapidas.news.framework.db.repository.RoomNewsRepository
import dagger.Binds
import dagger.Module

@Module
interface CacheRepositoryModule {
    @Binds
    fun bindRoomNewsRepository(
        roomNewsRepository: RoomNewsRepository
    ): INewsLocalRepository
}