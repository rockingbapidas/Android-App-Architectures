package com.bapidas.news.service.base

import dagger.android.DaggerIntentService

abstract class BaseIntentService(name: String) : DaggerIntentService(name)