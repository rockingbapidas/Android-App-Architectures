package com.bapidas.news.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/bapidas/news/ui/main/MainActivityModule;", "", "()V", "bindActivity", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/bapidas/news/ui/main/MainActivity;", "bindViewModel", "Lcom/bapidas/news/ui/base/viewmodel/BaseActivityViewModel;", "viewModel", "Lcom/bapidas/news/ui/main/MainViewModel;", "newsapp-v1.0.0(1)_debug"})
@dagger.Module(includes = {com.bapidas.news.ui.base.activity.BaseActivityModule.class})
public abstract class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.bapidas.news.di.scope.ActivityScope()
    @dagger.Binds()
    public abstract androidx.appcompat.app.AppCompatActivity bindActivity(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.ui.main.MainActivity activity);
    
    @org.jetbrains.annotations.NotNull()
    @com.bapidas.news.di.scope.ActivityScope()
    @com.bapidas.news.di.key.ActivityViewModelKey(value = com.bapidas.news.ui.main.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel bindViewModel(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.ui.main.MainViewModel viewModel);
    
    public MainActivityModule() {
        super();
    }
}