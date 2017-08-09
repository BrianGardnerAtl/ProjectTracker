package com.bignerdranch.android.projecttracker.controller

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.projecttracker.R
import com.bignerdranch.android.projecttracker.databinding.FragmentTaskListBinding

class TaskListFragment : Fragment() {

    lateinit var binding: FragmentTaskListBinding

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_task_list, container, false)

        return binding.root
    }
}
