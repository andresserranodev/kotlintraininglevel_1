package com.puzzlebench.kotlintraininglevel_1.data.repository

import com.puzzlebench.kotlintraininglevel_1.data.mapper.SportMapperRepository
import com.puzzlebench.kotlintraininglevel_1.data.model.SportRespository
import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport

class SportRespositoryImp {

    companion object {
        val VIDEO = "ITEM_TYPE_VIDEO"
        val PHOTO = "ITEM_TYPE_PHOTO"

    }

    private val BASE_SPORT_NAME = "sport"
    private val BASE_IMAGE_URL = "http://lorempixel.com/400/400/sports/"
    private var data = emptyList<SportRespository>()

    fun getData(): List<Sport> {

        if (data.isEmpty()) {
            Thread.sleep(2000)
            val videoItems = (1..5).map { SportRespository(it.toLong(), "$BASE_SPORT_NAME$it", "$BASE_IMAGE_URL$it", VIDEO) }
            val photosItems = (6..10).map { SportRespository(it.toLong(), "$BASE_SPORT_NAME$it", "$BASE_IMAGE_URL$it", PHOTO) }
            data = (photosItems + videoItems).sortedBy { it.id }

        }
        return SportMapperRepository().transform(data)
    }
}




