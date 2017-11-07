package com.puzzlebench.kotlintraininglevel_1.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.puzzlebench.kotlintraininglevel_1.R
import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport
import com.puzzlebench.kotlintraininglevel_1.ui.adapter.viewholder.SportAdapterViewHolder
import com.puzzlebench.trainingkotlin.extension.inflate
import kotlin.properties.Delegates

typealias Listener = (Sport) -> Unit

class SportAdapter(data: List<Sport> = emptyList(), val listener: Listener) : RecyclerView.Adapter<SportAdapterViewHolder>() {

    var data by Delegates.observable(data) { _, _, _ -> notifyDataSetChanged() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportAdapterViewHolder = SportAdapterViewHolder(parent.inflate(R.layout.view_item), listener)

    override fun onBindViewHolder(holder: SportAdapterViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size


}