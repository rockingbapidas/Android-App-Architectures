package com.bapidas.news.extensions

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bapidas.news.di.module.provide.GlideApp
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory

@BindingAdapter(value = ["android:src", "placeHolder"], requireAll = false)
fun ImageView.setImage(image: String?, placeHolder: Drawable?) {
    GlideApp.with(context)
        .load(image)
        .transition(
            DrawableTransitionOptions
                .withCrossFade(
                    DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()
                )
        )
        .placeholder(placeHolder)
        .into(this)
}