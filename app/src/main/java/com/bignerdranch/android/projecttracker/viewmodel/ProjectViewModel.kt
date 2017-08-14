package com.bignerdranch.android.projecttracker.viewmodel

import android.content.Context
import com.bignerdranch.android.projecttracker.R
import com.bignerdranch.android.projecttracker.model.Project

class ProjectViewModel(val project: Project, val context: Context) {

    fun getTitle(): String {
        return project.name
    }

    fun getNumberOfTasks(): String {
        return context.getString(R.string.project_number_of_tasks)
    }
}