package com.bignerdranch.android.projecttracker.controller.create.task

import android.support.v4.app.Fragment
import com.bignerdranch.android.projecttracker.controller.SingleFragmentActivity

class CreateTaskActivity : SingleFragmentActivity() {

    override fun getFragment(): Fragment {
        return CreateTaskFragment()
    }
}