package com.bapidas.news.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/bapidas/news/di/component/ApplicationComponent;", "Ldagger/android/AndroidInjector;", "Lcom/bapidas/news/NewsApplication;", "Builder", "newsapp-v1.0.0(1)_debug"})
@dagger.Component(modules = {com.bapidas.news.di.module.inject.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent extends dagger.android.AndroidInjector<com.bapidas.news.NewsApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/bapidas/news/di/component/ApplicationComponent$Builder;", "", "application", "Lcom/bapidas/news/NewsApplication;", "build", "Lcom/bapidas/news/di/component/ApplicationComponent;", "newsapp-v1.0.0(1)_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.bapidas.news.di.component.ApplicationComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.bapidas.news.NewsApplication application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.bapidas.news.di.component.ApplicationComponent build();
    }
}