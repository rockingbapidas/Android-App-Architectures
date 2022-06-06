package com.bapidas.news.appcore.service

import dagger.android.DaggerIntentService

abstract class BaseIntentService(name: String) : DaggerIntentService(name)