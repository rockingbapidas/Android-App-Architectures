package com.bapidas.news.di.key

import com.bapidas.news.ui.base.viewmodel.BaseViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
@MustBeDocumented
annotation class FragmentViewModelKey(val value: KClass<out BaseViewModel>)