package com.bapidas.news.appcore.viewmodel.factory

import androidx.lifecycle.ViewModel
import com.bapidas.news.appcore.di.scope.ActivityScope
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import javax.inject.Inject
import javax.inject.Provider

@ActivityScope
class ActivityViewModelFactory @Inject constructor(
    creators: Map<Class<out BaseActivityViewModel>,
            @JvmSuppressWildcards Provider<BaseActivityViewModel>>
) : BaseViewModelFactory(creators as Map<Class<out ViewModel>, Provider<ViewModel>>)