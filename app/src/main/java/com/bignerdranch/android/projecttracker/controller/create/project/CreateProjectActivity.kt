package com.bignerdranch.android.projecttracker.controller.create.project

import android.support.v4.app.Fragment
import com.bignerdranch.android.projecttracker.controller.SingleFragmentActivity

class CreateProjectActivity : SingleFragmentActivity() {
    override fun getFragment(): Fragment {
        return CreateProjectFragment()
    }
}