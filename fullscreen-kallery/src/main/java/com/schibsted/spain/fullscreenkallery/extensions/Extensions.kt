package com.schibsted.spain.fullscreenkallery.extensions

import android.content.Context
import android.content.res.Configuration
import android.graphics.Point
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager


fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}

val WindowManager.screenWidth: Int get() {
    val point = Point()
    this.defaultDisplay.getSize(point)
    return point.x
}

val WindowManager.screenHeight: Int get() {
    val point = Point()
    this.defaultDisplay.getSize(point)
    return point.y
}

fun Context.isLandscape(): Boolean {
    return Configuration.ORIENTATION_LANDSCAPE == this.resources.configuration.orientation
}


