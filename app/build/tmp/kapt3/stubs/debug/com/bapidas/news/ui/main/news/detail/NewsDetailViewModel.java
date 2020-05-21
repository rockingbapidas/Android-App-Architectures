package com.bapidas.news.ui.main.news.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/bapidas/news/ui/main/news/detail/NewsDetailViewModel;", "Lcom/bapidas/news/ui/base/viewmodel/BaseActivityViewModel;", "()V", "article", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bapidas/news/ui/model/Article;", "getArticle", "()Landroidx/lifecycle/MutableLiveData;", "handleIntent", "", "intent", "Landroid/content/Intent;", "newsapp-v1.0.0(1)_debug"})
@com.bapidas.news.di.scope.ActivityScope()
public final class NewsDetailViewModel extends com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.bapidas.news.ui.model.Article> article = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bapidas.news.ui.model.Article> getArticle() {
        return null;
    }
    
    @java.lang.Override()
    public void handleIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @javax.inject.Inject()
    public NewsDetailViewModel() {
        super();
    }
}