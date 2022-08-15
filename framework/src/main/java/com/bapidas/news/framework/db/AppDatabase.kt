package com.bapidas.news.framework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bapidas.news.framework.db.dao.IRoomNewsDao
import com.bapidas.news.framework.db.entity.NewsLocal

@Database(
    entities = [NewsLocal::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun roomNewsDao(): IRoomNewsDao

    companion object {
        private val lock = Any()
        private var INSTANCE: AppDatabase? = null

        fun getInstance(
            context: Context,
            databaseName: String,
            databaseVersion: Int
        ): AppDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = createDB(context, databaseName, databaseVersion)
                }
                return INSTANCE as AppDatabase
            }
        }

        private fun createDB(
            context: Context,
            databaseName: String,
            databaseVersion: Int
        ): AppDatabase {
            val database: Builder<AppDatabase> = Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                databaseName
            )

            return database.addCallback(object : Callback() {
            }).build()
        }
    }
}