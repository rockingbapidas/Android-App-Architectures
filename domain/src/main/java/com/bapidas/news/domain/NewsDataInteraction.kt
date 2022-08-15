package com.bapidas.news.domain

import com.bapidas.news.domain.usecases.*
import javax.inject.Inject

data class NewsDataInteraction @Inject constructor(
    val clearNews: ClearNews,
    val getNews: GetNews,
    val getNewsAfter: GetNewsAfter,
    val getNewsCount: GetNewsCount,
    val saveNews: SaveNews
)