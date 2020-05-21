package com.bapidas.news.common.extensions

import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter

@BindingAdapter("visibility")
fun View.setVisibility(show: Boolean) {
    visibility = if (show) View.VISIBLE else View.GONE
}

fun View.setMarginTop(marginTop: Int) {
    val menuLayoutParams = this.layoutParams as ViewGroup.MarginLayoutParams
    menuLayoutParams.setMargins(0, marginTop, 0, 0)
    this.layoutParams = menuLayoutParams
}