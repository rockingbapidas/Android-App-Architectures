package com.bapidas.news.framework.image

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bapidas.news.framework.di.module.GlideApp
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory

fun ImageView.load(image: String?, placeHolder: Drawable?) {
    val withCrossFade = DrawableTransitionOptions.withCrossFade(
        DrawableCrossFadeFactory.Builder()
            .setCrossFadeEnabled(true)
            .build()
    )
    GlideApp.with(context)
        .load(image)
        .transition(withCrossFade)
        .placeholder(placeHolder)
        .into(this)
}