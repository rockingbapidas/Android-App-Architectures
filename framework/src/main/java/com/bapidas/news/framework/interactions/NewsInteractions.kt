package com.bapidas.news.framework.interactions

import com.bapidas.news.domain.usecases.*

data class NewsInteractions(
    val saveNews: SaveNews,
    val getNews: GetNews,
    val getNewsAfter: GetNewsAfter,
    val getNewsCount: GetNewsCount,
    val clearNews: ClearNews
)