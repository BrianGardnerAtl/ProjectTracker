package com.bignerdranch.android.projecttracker.controller.create.task

import android.os.Bundle
import android.support.v4.app.Fragment
import com.bignerdranch.android.projecttracker.R

class CreateTaskFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity.setTitle(R.string.create_task_title)
    }
}