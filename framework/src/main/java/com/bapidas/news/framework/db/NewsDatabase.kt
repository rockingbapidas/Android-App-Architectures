package com.bapidas.news.framework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.bapidas.news.framework.BuildConfig
import com.bapidas.news.framework.db.dao.RoomNewsDao
import com.bapidas.news.framework.db.entity.NewsLocal
import timber.log.Timber

@Database(
    entities = [NewsLocal::class],
    version = BuildConfig.DATABASE_VERSION,
    exportSchema = false
)
abstract class NewsDatabase : RoomDatabase() {

    companion object {
        private val lock = Any()
        private var INSTANCE: NewsDatabase? = null

        fun getInstance(context: Context): NewsDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = createDB(context)
                }
                return INSTANCE as NewsDatabase
            }
        }

        private fun createDB(context: Context): NewsDatabase {
            val database: Builder<NewsDatabase> = Room.databaseBuilder(
                context,
                NewsDatabase::class.java,
                BuildConfig.DATABASE_NAME
            )

            return database.addCallback(object : Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    Timber.d("onCreate")
                }
            }).build()
        }
    }

    abstract fun roomNewsDao(): RoomNewsDao
}