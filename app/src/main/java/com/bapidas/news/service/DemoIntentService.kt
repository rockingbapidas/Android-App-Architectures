package com.bapidas.news.service

import android.content.Intent
import com.bapidas.news.appcore.service.BaseIntentService
import com.bapidas.news.headlines.service.HeadlinesDemoIntentService

class DemoIntentService : BaseIntentService(HeadlinesDemoIntentService::class.java.name) {
    override fun onHandleIntent(intent: Intent?) {
        TODO("Not yet implemented")
    }
}