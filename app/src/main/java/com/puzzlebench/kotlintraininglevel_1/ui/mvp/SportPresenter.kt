package com.puzzlebench.kotlintraininglevel_1.ui.mvp

import com.puzzlebench.kotlintraininglevel_1.domain.usecase.GetSportRepositoryUseCase
import com.puzzlebench.kotlintraininglevel_1.ui.weak
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class SuperHeroesPresenter(
        view: SportView,
        private val getSportRepositoryUseCase: GetSportRepositoryUseCase) {
    private val view: SportView? by weak(view)

    fun int() {
        doAsync {
            view?.showLoading()
            var data = getSportRepositoryUseCase.invoke()
            uiThread {
                view?.showSports(data)
                view?.hideLoading()

            }
        }
    }

}
