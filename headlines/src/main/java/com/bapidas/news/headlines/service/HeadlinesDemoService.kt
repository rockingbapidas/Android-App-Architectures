package com.bapidas.news.headlines.service

import android.content.Intent
import android.os.IBinder
import com.bapidas.news.appcore.service.BaseService

class HeadlinesDemoService : BaseService() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}