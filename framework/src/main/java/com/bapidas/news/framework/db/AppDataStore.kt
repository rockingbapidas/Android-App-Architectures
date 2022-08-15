package com.bapidas.news.framework.db

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AppDataStore constructor(storeName: String, storeVersion: Int) {
    private val Context.myDataStore by preferencesDataStore(storeName)

    suspend fun <T> insert(context: Context, key: Preferences.Key<T>, value: T) =
        context.myDataStore.edit { preference ->
            preference[key] = value
        }

    suspend fun <T> update(context: Context, key: Preferences.Key<T>, value: T) =
        context.myDataStore.edit { preference ->
            if (preference[key] != value) {
                preference[key] = value
            }
        }

    suspend fun <T> clear(context: Context, key: Preferences.Key<T>) =
        context.myDataStore.edit { preference ->
            preference.minusAssign(key)
        }

    suspend fun clearAll(context: Context) =
        context.myDataStore.edit { preference ->
            preference.clear()
        }

    fun <T> get(context: Context, key: Preferences.Key<T>): Flow<T?> =
        context.myDataStore.data.map { preference ->
            preference[key]
        }

    companion object {
        private val lock = Any()
        private var INSTANCE: AppDataStore? = null

        fun getInstance(
            storeName: String,
            storeVersion: Int
        ): AppDataStore {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = AppDataStore(storeName, storeVersion)
                }
                return INSTANCE as AppDataStore
            }
        }
    }
}