package com.bapidas.news.di.component

import com.bapidas.news.NewsApplication
import com.bapidas.news.di.module.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent : AndroidInjector<NewsApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: NewsApplication): Builder

        fun build(): ApplicationComponent
    }
}
