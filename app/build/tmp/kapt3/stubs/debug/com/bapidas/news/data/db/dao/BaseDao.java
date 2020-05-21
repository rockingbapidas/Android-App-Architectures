package com.bapidas.news.data.db.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\'J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\nJ\'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b\"\u00028\u0000H\'\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\'J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/bapidas/news/data/db/dao/BaseDao;", "T", "", "delete", "", "obj", "(Ljava/lang/Object;)I", "", "insert", "", "(Ljava/lang/Object;)J", "", "([Ljava/lang/Object;)Ljava/util/List;", "update", "newsapp-v1.0.0(1)_debug"})
public abstract interface BaseDao<T extends java.lang.Object> {
    
    /**
     * Insert an object in the database.
     *
     * @param obj the object to be inserted.
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(T obj);
    
    /**
     * Insert an array of objects in the database.
     *
     * @param obj the objects to be inserted.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract java.util.List<java.lang.Long> insert(@org.jetbrains.annotations.NotNull()
    T... obj);
    
    /**
     * Insert an list of objects in the database.
     *
     * @param obj the objects to be inserted.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.util.List<java.lang.Long> insert(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> obj);
    
    /**
     * Update an object from the database.
     *
     * @param obj the object to be updated
     */
    @androidx.room.Update()
    public abstract int update(T obj);
    
    /**
     * Update list of object from the database.
     *
     * @param obj the object to be updated
     */
    @androidx.room.Update()
    public abstract int update(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> obj);
    
    /**
     * Delete an object from the database
     *
     * @param obj the object to be deleted
     */
    @androidx.room.Delete()
    public abstract int delete(T obj);
    
    /**
     * Delete list of object from the database
     *
     * @param obj the object to be deleted
     */
    @androidx.room.Delete()
    public abstract int delete(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> obj);
}