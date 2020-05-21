package com.bapidas.news.ui.base.viewmodel.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\'\u0012 \u0010\u0002\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0003\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0016\u00a2\u0006\u0002\u0010\u000bR(\u0010\u0002\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/bapidas/news/ui/base/viewmodel/factory/BaseViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "creators", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ViewModel;", "Ljavax/inject/Provider;", "(Ljava/util/Map;)V", "create", "T", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "newsapp-v1.0.0(1)_debug"})
public abstract class BaseViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private final java.util.Map<java.lang.Class<? extends androidx.lifecycle.ViewModel>, javax.inject.Provider<androidx.lifecycle.ViewModel>> creators = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    public BaseViewModelFactory(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends androidx.lifecycle.ViewModel>, ? extends javax.inject.Provider<androidx.lifecycle.ViewModel>> creators) {
        super();
    }
}