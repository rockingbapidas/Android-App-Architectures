package com.bapidas.news.ui.main.news.detail

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.bapidas.news.R
import com.bapidas.news.common.extensions.getStatusBarHeight
import com.bapidas.news.common.extensions.makeStatusBarTransparent
import com.bapidas.news.common.extensions.setMarginTop
import com.bapidas.news.databinding.ActivityNewsDetailBinding
import com.bapidas.news.ui.base.activity.BaseActivity
import com.bapidas.news.ui.model.Article
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
        img_back.setOnClickListener {
            onBackPressed()
        }
        supportStartPostponedEnterTransition()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        supportFinishAfterTransition()
    }

    companion object {
        const val NEWS_EXTRA_DATA = "newExtra"

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