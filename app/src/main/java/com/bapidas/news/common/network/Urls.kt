package com.bapidas.news.common.network

import com.bapidas.news.BuildConfig

object Urls {
    var BASE_URL = BuildConfig.API_DOMAIN

    object News {
        const val ARTICLES_API = "/v2/everything"
    }
}