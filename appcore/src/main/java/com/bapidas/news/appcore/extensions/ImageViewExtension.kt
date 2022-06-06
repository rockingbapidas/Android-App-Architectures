package com.bapidas.news.appcore.extensions

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bapidas.news.framework.image.load

@BindingAdapter(value = ["android:src", "placeHolder"], requireAll = false)
fun ImageView.setImage(image: String?, placeHolder: Drawable?) {
    load(image, placeHolder)
}