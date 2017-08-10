package com.bignerdranch.android.projecttracker.extension

import android.content.Context
import com.bignerdranch.android.projecttracker.controller.ProjectTrackerApplication
import com.bignerdranch.android.projecttracker.inject.AppGraph

val Context.graph: AppGraph
    get() {
        val app = applicationContext as ProjectTrackerApplication
        return app.graph
    }