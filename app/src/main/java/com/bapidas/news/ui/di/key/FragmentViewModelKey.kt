package com.bapidas.news.ui.di.key

import com.bapidas.news.ui.base.viewmodel.BaseFragmentViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
@MustBeDocumented
annotation class FragmentViewModelKey(val value: KClass<out BaseFragmentViewModel>)