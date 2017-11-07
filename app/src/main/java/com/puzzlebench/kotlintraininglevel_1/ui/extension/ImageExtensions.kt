package com.puzzlebench.trainingkotlin.extension

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.getImageByUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}
