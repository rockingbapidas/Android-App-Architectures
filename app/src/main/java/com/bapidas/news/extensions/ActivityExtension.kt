package com.bapidas.news.extensions

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.bapidas.news.R

fun Activity.makeStatusBarTransparent() {
    window.apply {
        clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        } else {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        statusBarColor = getColor(R.color.colorTransparentStatus)
    }
}

fun AppCompatActivity.getStatusBarHeight(): Int {
    var result = 0
    val resourceId = this.resources.getIdentifier(
        "status_bar_height",
        "dimen", "android"
    )
    if (resourceId > 0) {
        result = this.resources.getDimensionPixelSize(resourceId)
    }
    return result
}