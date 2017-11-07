package com.puzzlebench.kotlintraininglevel_1.data.mapper

import com.puzzlebench.kotlintraininglevel_1.data.model.SportRespository
import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport


open class SportMapperRepository : BaseMapperRepository<SportRespository, Sport> {

    override fun transform(sportRespository: SportRespository): Sport
            = Sport(sportRespository.id, sportRespository.title, sportRespository.urlImage, sportRespository.type)

    override fun transformToResponse(type: Sport): SportRespository
            = SportRespository(type.id, type.title, type.urlImage, type.type)

    fun transform(sportsRespository: List<SportRespository>): List<Sport>
            = sportsRespository.map { transform(it) }
}
