package com.bapidas.news.di

import android.app.Application
import com.app.sportstr.di.AppModule
import com.bapidas.news.NewsApplication
import com.bapidas.news.appcore.di.AppCoreComponent
import com.bapidas.news.appcore.di.BaseComponentProvider
import com.bapidas.news.framework.di.FrameworkComponent
import com.bapidas.news.main.MainActivitySubComponent
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [AppModule::class],
    dependencies = [AppCoreComponent::class, FrameworkComponent::class]
)
interface AppComponent {

    fun inject(newsApplication: NewsApplication)

    fun newMainActivitySubComponent(): MainActivitySubComponent

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun core(coreComponent: AppCoreComponent): Builder

        fun framework(frameworkComponent: FrameworkComponent): Builder

        fun build(): AppComponent
    }
}

interface AppComponentProvider : BaseComponentProvider {
    fun provideAppComponent(): AppComponent
}