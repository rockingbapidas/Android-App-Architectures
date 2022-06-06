package com.bapidas.news.headlines.browser

import android.graphics.Bitmap
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.lifecycle.MutableLiveData
import com.bapidas.news.appcore.di.scope.FragmentScope
import com.bapidas.news.appcore.viewmodel.BaseFragmentViewModel
import com.bapidas.news.headlines.model.Article
import timber.log.Timber
import javax.inject.Inject

@FragmentScope
class NewsBrowserViewModel @Inject constructor() : BaseFragmentViewModel() {
    val article = MutableLiveData<Article>()
    val isLoading = MutableLiveData<Boolean>()

    val hzWebClient = object : WebViewClient() {
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
            Timber.d("onPageStarted $url")
            isLoading.value = true
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            Timber.d("onPageFinished")
            isLoading.value = false
        }
    }

    override fun handleArguments(bundle: Bundle) {
        super.handleArguments(bundle)
        bundle.apply {
            article.value = getSerializable(NewsBrowserFragment.NEWS_EXTRA_DATA) as Article
        }
    }
}