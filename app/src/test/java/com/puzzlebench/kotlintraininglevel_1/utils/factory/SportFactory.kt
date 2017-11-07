package com.puzzlebench.kotlintraininglevel_1.utils.factory

import com.puzzlebench.kotlintraininglevel_1.data.model.SportRespository
import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport
import com.puzzlebench.kotlintraininglevel_1.utils.factory.DataFactory.Factory.randomLong
import com.puzzlebench.kotlintraininglevel_1.utils.factory.DataFactory.Factory.randomUuid

class SportFactory {

    companion object Factory {

        fun makeSportResponse(): SportRespository =
                SportRespository(randomLong(), randomUuid(), randomUuid(), randomUuid())

        fun makeSport(): Sport =
                Sport(randomLong(), randomUuid(), randomUuid(), randomUuid())


    }

}
