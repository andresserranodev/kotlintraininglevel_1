package com.puzzlebench.kotlintraininglevel_1.ui.mvp

import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport

/**
 * Created by andres.serrano on 6/11/2017.
 */
interface SportView {
    fun hideLoading()
    fun showSports(sport: List<Sport>)
    fun showLoading()
}