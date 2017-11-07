package com.puzzlebench.kotlintraininglevel_1.data

import com.puzzlebench.kotlintraininglevel_1.data.mapper.SportMapperRepository
import com.puzzlebench.kotlintraininglevel_1.data.model.SportRespository
import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport
import com.puzzlebench.kotlintraininglevel_1.utils.factory.SportFactory
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class SportMapperServiceTest {
    private lateinit var sportMapperResponse: SportMapperRepository

    @Before
    fun setUp() {
        sportMapperResponse = SportMapperRepository()
    }


    @Test
    fun transformForResponse() {

        val sportResponse = SportFactory.makeSportResponse()
        val sport = sportMapperResponse.transform(sportResponse)
        assertBufferooDataEquality(sportResponse, sport)
    }

    @Test
    fun transformToResponse() {

        val sport = SportFactory.makeSport()
        val sportResponse = sportMapperResponse.transformToResponse(sport)
        assertBufferooDataEquality(sportResponse, sport)

    }

    private fun assertBufferooDataEquality(sportResponse: SportRespository,
                                           sports: Sport) {
        assertEquals(sportResponse.title, sports.title)
        assertEquals(sportResponse.id, sports.id)
        assertEquals(sportResponse.urlImage, sports.urlImage)


    }

}