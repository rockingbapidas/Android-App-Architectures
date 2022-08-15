package com.bapidas.news

import androidx.multidex.MultiDexApplication
import com.bapidas.news.appcore.di.AppCoreComponent
import com.bapidas.news.appcore.di.DaggerAppCoreComponent
import com.bapidas.news.di.AppComponent
import com.bapidas.news.di.AppComponentProvider
import com.bapidas.news.di.DaggerAppComponent
import com.bapidas.news.framework.di.DaggerFrameworkComponent
import com.bapidas.news.framework.di.FrameworkComponent
import com.bapidas.news.headlines.di.DaggerHeadlinesComponent
import com.bapidas.news.headlines.di.HeadlinesComponent
import com.bapidas.news.headlines.di.HeadlinesComponentProvider
import timber.log.Timber
import javax.inject.Inject

class NewsApplication : MultiDexApplication(), AppComponentProvider, HeadlinesComponentProvider {
    private var appComponent: AppComponent? = null
    private var headlinesComponent: HeadlinesComponent? = null

    @Inject
    lateinit var timberTree: Timber.Tree

    override fun onCreate() {
        super.onCreate()
        initAppComponent()
        Timber.plant(timberTree)
    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent
            .builder()
            .application(this)
            .core(coreComponent())
            .framework(frameWorkComponent())
            .build()
        appComponent?.inject(this)
    }

    override fun provideAppComponent(): AppComponent {
        if (appComponent == null) initAppComponent()
        return appComponent!!
    }

    private fun coreComponent(): AppCoreComponent {
        return DaggerAppCoreComponent.factory().create(
            this,
            BuildConfig.ENABLE_LOGS,
            BuildConfig.DEBUG.not()
        )
    }

    private fun frameWorkComponent(): FrameworkComponent {
        return DaggerFrameworkComponent.factory().create(
            this,
            BuildConfig.API_DOMAIN,
            BuildConfig.DATABASE_NAME,
            BuildConfig.DATABASE_VERSION,
            BuildConfig.DATASTORE_NAME,
            BuildConfig.DATASTORE_VERSION,
            getString(R.string.app_name),
            BuildConfig.VERSION_NAME,
            BuildConfig.ENABLE_LOGS,
            BuildConfig.DEBUG.not(),
            BuildConfig.GOOGLE_MAPS_KEY,
            BuildConfig.NEWS_DATA_API_KEY
        )
    }

    private fun initHeadlinesComponent() {
        headlinesComponent = DaggerHeadlinesComponent
            .builder()
            .application(this)
            .core(coreComponent())
            .framework(frameWorkComponent())
            .build()
    }

    override fun provideHeadlinesComponent(): HeadlinesComponent {
        if (headlinesComponent == null) initHeadlinesComponent()
        return headlinesComponent!!
    }
}