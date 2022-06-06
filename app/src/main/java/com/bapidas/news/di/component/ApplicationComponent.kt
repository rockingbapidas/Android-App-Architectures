package com.bapidas.news.di.component

import com.bapidas.news.NewsApplication
import com.bapidas.news.di.ApplicationModule
import com.bapidas.news.framework.di.FrameworkModule
import com.bapidas.news.headlines.di.HeadlinesModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

@Component(modules = [ApplicationModule::class, FrameworkModule::class, HeadlinesModule::class])
interface ApplicationComponent : AndroidInjector<NewsApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: NewsApplication): Builder

        fun build(): ApplicationComponent
    }
}
