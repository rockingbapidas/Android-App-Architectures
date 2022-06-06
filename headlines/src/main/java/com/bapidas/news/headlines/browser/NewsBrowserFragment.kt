package com.bapidas.news.headlines.browser

import android.os.Bundle
import android.view.View
import com.bapidas.news.appcore.fragment.BaseFragment
import com.bapidas.news.headlines.R
import com.bapidas.news.headlines.databinding.FragmentNewsBinding
import kotlinx.android.synthetic.main.fragment_news.*

class NewsBrowserFragment : BaseFragment<FragmentNewsBinding, NewsBrowserViewModel>() {
    override val layoutViewRes: Int
        get() = R.layout.fragment_news
    override val viewModelClass: Class<NewsBrowserViewModel>
        get() = NewsBrowserViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        web_view.apply {
            webViewClient = viewModel.hzWebClient
            settings.apply {
                userAgentString = WEB_VIEW_USER_AGENT
                javaScriptEnabled = true
                domStorageEnabled = true
            }
            clearCache(true)
        }
    }

    companion object {
        const val NEWS_EXTRA_DATA = "newsExtra"
        const val WEB_VIEW_USER_AGENT =
            "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19"

        fun newInstance(): NewsBrowserFragment {
            return NewsBrowserFragment()
        }
    }
}