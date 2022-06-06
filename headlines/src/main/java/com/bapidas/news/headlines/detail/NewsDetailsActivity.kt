package com.bapidas.news.headlines.detail

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.core.os.bundleOf
import androidx.core.util.Pair
import com.bapidas.news.appcore.activity.BaseActivity
import com.bapidas.news.appcore.extensions.getStatusBarHeight
import com.bapidas.news.appcore.extensions.makeStatusBarTransparent
import com.bapidas.news.appcore.extensions.replaceFragment
import com.bapidas.news.appcore.extensions.setMarginTop
import com.bapidas.news.headlines.R
import com.bapidas.news.headlines.browser.NewsBrowserFragment
import com.bapidas.news.headlines.databinding.ActivityNewsDetailBinding
import com.bapidas.news.headlines.model.Article
import kotlinx.android.synthetic.main.activity_news_detail.*

class NewsDetailsActivity : BaseActivity<ActivityNewsDetailBinding, NewsDetailViewModel>() {
    override val layoutViewRes: Int = R.layout.activity_news_detail

    override val viewModelClass: Class<NewsDetailViewModel> = NewsDetailViewModel::class.java

    override fun onViewModelCreated() {
        super.onViewModelCreated()
        supportPostponeEnterTransition()
    }

    override fun onViewCreated() {
        super.onViewCreated()
        makeStatusBarTransparent()
        appbar.setMarginTop(getStatusBarHeight())
        container.setMarginTop(getStatusBarHeight())
        img_back.setOnClickListener {
            onBackPressed()
        }
        img_web.setOnClickListener {
            replaceFragment(
                container.id,
                NewsBrowserFragment.newInstance(),
                arguments = bundleOf(
                    NewsBrowserFragment.NEWS_EXTRA_DATA to viewModel.article.value
                ),
                addToBackStack = true
            )
        }
        supportStartPostponedEnterTransition()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStackImmediate()
        } else {
            super.onBackPressed()
            supportFinishAfterTransition()
        }
    }

    companion object {
        const val NEWS_EXTRA_DATA = "newsExtra"

        fun open(parent: View, article: Article, fromActivity: Activity) {
            val card =
                Pair.create(parent, "card")
            val image =
                Pair.create(parent.findViewById(R.id.imgBg) as View, "image")
            val view =
                Pair.create(parent.findViewById(R.id.view) as View, "view")
            val title =
                Pair.create(parent.findViewById(R.id.tv_title) as View, "title")
            val source =
                Pair.create(parent.findViewById(R.id.tv_source) as View, "source")
            val date =
                Pair.create(parent.findViewById(R.id.tv_date) as View, "date")
            val activityOptionsCompat =
                ActivityOptionsCompat.makeSceneTransitionAnimation(
                    fromActivity, card, image, view, title, source, date
                )
            val intent = Intent(fromActivity, NewsDetailsActivity::class.java).apply {
                putExtra(NEWS_EXTRA_DATA, article)
            }
            fromActivity.startActivity(intent, activityOptionsCompat.toBundle())
        }
    }
}