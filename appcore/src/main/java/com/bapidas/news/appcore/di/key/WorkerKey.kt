package com.bapidas.news.appcore.di.key

import androidx.work.ListenableWorker
import dagger.MapKey
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
@MustBeDocumented
annotation class WorkerKey(val value: KClass<out ListenableWorker>)