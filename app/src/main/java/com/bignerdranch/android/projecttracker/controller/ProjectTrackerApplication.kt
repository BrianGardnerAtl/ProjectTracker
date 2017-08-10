package com.bignerdranch.android.projecttracker.controller

import android.app.Application
import com.bignerdranch.android.projecttracker.inject.AppComponent
import com.bignerdranch.android.projecttracker.inject.AppGraph

class ProjectTrackerApplication: Application() {

    lateinit var graph: AppGraph

    override fun onCreate() {
        super.onCreate()
        setupDagger()
    }

    private fun setupDagger() {
        graph = AppComponent.Initializer.init(this)
    }
}