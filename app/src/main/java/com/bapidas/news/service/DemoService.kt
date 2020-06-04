package com.bapidas.news.service

import android.content.Intent
import android.os.IBinder
import com.bapidas.news.service.base.BaseService

class DemoService : BaseService() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}