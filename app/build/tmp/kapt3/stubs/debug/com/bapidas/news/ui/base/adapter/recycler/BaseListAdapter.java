package com.bapidas.news.ui.base.adapter.recycler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH$J\u0015\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH$J\u001e\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016\u00a8\u0006\u0016"}, d2 = {"Lcom/bapidas/news/ui/base/adapter/recycler/BaseListAdapter;", "T", "Landroidx/paging/PagedListAdapter;", "Lcom/bapidas/news/ui/base/adapter/recycler/BaseViewHolder;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getCallbackForPosition", "", "position", "", "getItemAt", "(I)Ljava/lang/Object;", "getItemViewType", "getLayoutIdForPosition", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "newsapp-v1.0.0(1)_debug"})
public abstract class BaseListAdapter<T extends java.lang.Object> extends androidx.paging.PagedListAdapter<T, com.bapidas.news.ui.base.adapter.recycler.BaseViewHolder<T>> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bapidas.news.ui.base.adapter.recycler.BaseViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.bapidas.news.ui.base.adapter.recycler.BaseViewHolder<T> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Object getCallbackForPosition(int position);
    
    protected abstract int getLayoutIdForPosition(int position);
    
    @org.jetbrains.annotations.Nullable()
    public final T getItemAt(int position) {
        return null;
    }
    
    public BaseListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super(null);
    }
}