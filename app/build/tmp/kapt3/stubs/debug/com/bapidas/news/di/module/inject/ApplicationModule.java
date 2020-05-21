package com.bapidas.news.di.module.inject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\'\u00a8\u0006\t"}, d2 = {"Lcom/bapidas/news/di/module/inject/ApplicationModule;", "", "()V", "bindApplication", "Landroid/app/Application;", "application", "Lcom/bapidas/news/NewsApplication;", "bindApplicationContext", "Landroid/content/Context;", "newsapp-v1.0.0(1)_debug"})
@dagger.Module(includes = {dagger.android.AndroidInjectionModule.class, com.bapidas.news.di.module.inject.ActivityBuilderModule.class, com.bapidas.news.di.module.provide.TimberModule.class, com.bapidas.news.di.module.provide.RxJavaModule.class, com.bapidas.news.di.module.provide.NetworkModule.class, com.bapidas.news.di.module.provide.ApiModule.class, com.bapidas.news.di.module.provide.RoomModule.class})
public abstract class ApplicationModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract android.app.Application bindApplication(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.NewsApplication application);
    
    @org.jetbrains.annotations.NotNull()
    @com.bapidas.news.di.qualifier.ApplicationContext()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract android.content.Context bindApplicationContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    public ApplicationModule() {
        super();
    }
}