package com.bignerdranch.android.projecttracker.inject

import com.bignerdranch.android.projecttracker.controller.list.CompletedListFragment
import com.bignerdranch.android.projecttracker.controller.list.ProjectListFragment
import com.bignerdranch.android.projecttracker.controller.list.TaskListFragment

interface AppGraph {
    fun inject(fragment: ProjectListFragment)
    fun inject(fragment: CompletedListFragment)
    fun inject(fragment: TaskListFragment)
}