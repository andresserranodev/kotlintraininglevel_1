package com.puzzlebench.kotlintraininglevel_1.ui.adapter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.puzzlebench.kotlintraininglevel_1.data.repository.SportRespositoryImp.Companion.PHOTO
import com.puzzlebench.kotlintraininglevel_1.data.repository.SportRespositoryImp.Companion.VIDEO
import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport
import com.puzzlebench.kotlintraininglevel_1.ui.adapter.Listener
import com.puzzlebench.trainingkotlin.extension.getImageByUrl
import kotlinx.android.synthetic.main.view_item.view.*

class SportAdapterViewHolder(view: View, val listener: Listener) : RecyclerView.ViewHolder(view) {

    fun bind(item: Sport) = with(itemView) {
        item_title.text = item.title
        item_image.getImageByUrl(item.urlImage)
        item_media_video_indicator.visibility = when (item.type) {
            PHOTO -> View.GONE
            VIDEO -> View.VISIBLE
            else -> {
                View.GONE
            }
        }
        setOnClickListener { listener(item) }
    }
}