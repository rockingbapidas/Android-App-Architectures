package com.bapidas.news.ui.base.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/bapidas/news/ui/base/activity/BaseActivityModule;", "", "()V", "bindActivityContext", "Landroid/content/Context;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/bapidas/news/ui/base/viewmodel/factory/ActivityViewModelFactory;", "Companion", "newsapp-v1.0.0(1)_debug"})
@dagger.Module()
public abstract class BaseActivityModule {
    public static final com.bapidas.news.ui.base.activity.BaseActivityModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.bapidas.news.di.qualifier.ActivityContext()
    @com.bapidas.news.di.scope.ActivityScope()
    @dagger.Binds()
    public abstract android.content.Context bindActivityContext(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity);
    
    @org.jetbrains.annotations.NotNull()
    @com.bapidas.news.di.scope.ActivityScope()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.ui.base.viewmodel.factory.ActivityViewModelFactory viewModelFactory);
    
    public BaseActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.bapidas.news.di.qualifier.ActivityContext()
    @com.bapidas.news.di.scope.ActivityScope()
    @dagger.Provides()
    public static final androidx.lifecycle.ViewModelProvider provideViewModelProvider(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/bapidas/news/ui/base/activity/BaseActivityModule$Companion;", "", "()V", "provideViewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "newsapp-v1.0.0(1)_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @com.bapidas.news.di.qualifier.ActivityContext()
        @com.bapidas.news.di.scope.ActivityScope()
        @dagger.Provides()
        public final androidx.lifecycle.ViewModelProvider provideViewModelProvider(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.ViewModelProvider.Factory viewModelFactory) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}