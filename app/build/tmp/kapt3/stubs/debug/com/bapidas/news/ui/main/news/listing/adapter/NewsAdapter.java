package com.bapidas.news.ui.main.news.listing.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/bapidas/news/ui/main/news/listing/adapter/NewsAdapter;", "Lcom/bapidas/news/ui/base/adapter/recycler/BaseListAdapter;", "Lcom/bapidas/news/ui/model/Article;", "callback", "Lcom/bapidas/news/ui/base/adapter/callback/ItemViewListener;", "(Lcom/bapidas/news/ui/base/adapter/callback/ItemViewListener;)V", "getCallback", "()Lcom/bapidas/news/ui/base/adapter/callback/ItemViewListener;", "getCallbackForPosition", "", "position", "", "getLayoutIdForPosition", "Companion", "newsapp-v1.0.0(1)_debug"})
public final class NewsAdapter extends com.bapidas.news.ui.base.adapter.recycler.BaseListAdapter<com.bapidas.news.ui.model.Article> {
    @org.jetbrains.annotations.NotNull()
    private final com.bapidas.news.ui.base.adapter.callback.ItemViewListener callback = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.bapidas.news.ui.model.Article> NEWS_COMPARATOR = null;
    public static final com.bapidas.news.ui.main.news.listing.adapter.NewsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Object getCallbackForPosition(int position) {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutIdForPosition(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bapidas.news.ui.base.adapter.callback.ItemViewListener getCallback() {
        return null;
    }
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.ui.base.adapter.callback.ItemViewListener callback) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/bapidas/news/ui/main/news/listing/adapter/NewsAdapter$Companion;", "", "()V", "NEWS_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/bapidas/news/ui/model/Article;", "getNEWS_COMPARATOR", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "newsapp-v1.0.0(1)_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.bapidas.news.ui.model.Article> getNEWS_COMPARATOR() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}