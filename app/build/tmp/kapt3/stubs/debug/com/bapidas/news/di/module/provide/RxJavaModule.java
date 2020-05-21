package com.bapidas.news.di.module.provide;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/bapidas/news/di/module/provide/RxJavaModule;", "", "()V", "provideObserverOn", "Lio/reactivex/Scheduler;", "provideSubscriberOn", "Companion", "newsapp-v1.0.0(1)_debug"})
@dagger.Module()
public final class RxJavaModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUBCRIBER_ON = "SubscribeOn";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OBSERVER_ON = "ObserverOn";
    public static final com.bapidas.news.di.module.provide.RxJavaModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "SubscribeOn")
    @dagger.Provides()
    public final io.reactivex.Scheduler provideSubscriberOn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "ObserverOn")
    @dagger.Provides()
    public final io.reactivex.Scheduler provideObserverOn() {
        return null;
    }
    
    public RxJavaModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bapidas/news/di/module/provide/RxJavaModule$Companion;", "", "()V", "OBSERVER_ON", "", "SUBCRIBER_ON", "newsapp-v1.0.0(1)_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}