package com.bapidas.news.di.module.provide;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/bapidas/news/di/module/provide/RoomModule;", "", "()V", "providesAppDatabase", "Lcom/bapidas/news/data/db/AppDatabase;", "application", "Landroid/app/Application;", "providesNewsDao", "Lcom/bapidas/news/data/db/dao/NewsArticlesDao;", "appDatabase", "newsapp-v1.0.0(1)_debug"})
@dagger.Module()
public final class RoomModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.bapidas.news.data.db.AppDatabase providesAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bapidas.news.data.db.dao.NewsArticlesDao providesNewsDao(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.data.db.AppDatabase appDatabase) {
        return null;
    }
    
    public RoomModule() {
        super();
    }
}