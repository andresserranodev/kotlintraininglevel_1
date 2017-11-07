package com.puzzlebench.kotlintraininglevel_1.domain.usecase

import com.puzzlebench.kotlintraininglevel_1.data.repository.SportRespositoryImp
import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport

class GetSportRepositoryUseCase(private val sportRespositoryImp: SportRespositoryImp) {

    operator fun invoke(): List<Sport> = sportRespositoryImp.getData()
}