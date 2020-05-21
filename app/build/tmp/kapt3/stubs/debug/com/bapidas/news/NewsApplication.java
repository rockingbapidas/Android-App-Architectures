package com.bapidas.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/bapidas/news/NewsApplication;", "Ldagger/android/DaggerApplication;", "()V", "timberTree", "Ltimber/log/Timber$Tree;", "getTimberTree", "()Ltimber/log/Timber$Tree;", "setTimberTree", "(Ltimber/log/Timber$Tree;)V", "applicationInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "newsapp-v1.0.0(1)_debug"})
public final class NewsApplication extends dagger.android.DaggerApplication {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public timber.log.Timber.Tree timberTree;
    
    @org.jetbrains.annotations.NotNull()
    public final timber.log.Timber.Tree getTimberTree() {
        return null;
    }
    
    public final void setTimberTree(@org.jetbrains.annotations.NotNull()
    timber.log.Timber.Tree p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public NewsApplication() {
        super();
    }
}