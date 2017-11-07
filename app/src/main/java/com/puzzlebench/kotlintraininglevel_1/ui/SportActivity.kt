package com.puzzlebench.kotlintraininglevel_1.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.view.View
import com.puzzlebench.kotlintraininglevel_1.R
import com.puzzlebench.kotlintraininglevel_1.data.repository.SportRespositoryImp
import com.puzzlebench.kotlintraininglevel_1.domain.model.Sport
import com.puzzlebench.kotlintraininglevel_1.domain.usecase.GetSportRepositoryUseCase
import com.puzzlebench.kotlintraininglevel_1.ui.adapter.SportAdapter
import com.puzzlebench.kotlintraininglevel_1.ui.mvp.SportView
import com.puzzlebench.kotlintraininglevel_1.ui.mvp.SuperHeroesPresenter
import com.puzzlebench.trainingkotlin.extension.showToast
import kotlinx.android.synthetic.main.activity_main.*

class SportActivity : AppCompatActivity(), SportView {


    var presenter = SuperHeroesPresenter(this, GetSportRepositoryUseCase(sportRespositoryImp = SportRespositoryImp()))
    var adapter = SportAdapter { sport -> showToast(sport.title) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.int()
        recycle.layoutManager = GridLayoutManager(this, 2)
        recycle.adapter = adapter
    }

    override fun hideLoading() {
        progressBar.visibility = View.GONE
    }

    override fun showSports(sport: List<Sport>) {
        adapter.data = sport

    }

    override fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

}
