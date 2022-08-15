package com.bapidas.news.headlines.listing.paging

import androidx.paging.ItemKeyedDataSource
import com.bapidas.news.domain.NewsDataInteraction
import com.bapidas.news.headlines.model.Article
import com.bapidas.news.headlines.model.mapToArticle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

class NewsDataSource(
    private val mNewsInteractions: NewsDataInteraction,
    private val mCoroutineScope: CoroutineScope
) : ItemKeyedDataSource<String, Article>() {

    override fun loadInitial(
        params: LoadInitialParams<String>,
        callback: LoadInitialCallback<Article>
    ) {
        Timber.v("loadInitial %s", "${"// "}${params.requestedLoadSize}")
        mCoroutineScope.launch {
            try {
                val result = withContext(Dispatchers.IO) {
                    mNewsInteractions.getNews(
                        local = true,
                        requestedLoadSize = REQUEST_LOAD_SIZE
                    )
                }
                callback.onResult(result.mapToArticle())
            } catch (e: Exception) {
                callback.onError(e)
            }
        }
    }

    override fun loadBefore(params: LoadParams<String>, callback: LoadCallback<Article>) {
        Timber.v("loadBefore")
    }

    override fun loadAfter(params: LoadParams<String>, callback: LoadCallback<Article>) {
        Timber.v("loadAfter %s", "${params.key}${" // "}${params.requestedLoadSize}")
        mCoroutineScope.launch {
            try {
                val result = withContext(Dispatchers.IO) {
                    mNewsInteractions.getNewsAfter(
                        local = true,
                        requestedLoadSize = params.requestedLoadSize,
                        key = params.key,
                        page = 0
                    )
                }
                callback.onResult(result.mapToArticle())
            } catch (e: Exception) {
                callback.onError(e)
            }
        }
    }

    override fun getKey(item: Article): String {
        Timber.v("getKey %s ", item.publishedAt)
        return item.publishedAt
    }

    companion object {
        private const val REQUEST_LOAD_SIZE = 20
    }
}