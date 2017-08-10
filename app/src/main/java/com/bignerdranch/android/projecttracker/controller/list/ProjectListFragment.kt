package com.bignerdranch.android.projecttracker.controller.list


import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.projecttracker.R
import com.bignerdranch.android.projecttracker.controller.create.project.CreateProjectActivity
import com.bignerdranch.android.projecttracker.databinding.FragmentListBinding

class ProjectListFragment : Fragment() {

    lateinit var binding: FragmentListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity.setTitle(R.string.item_projects_title)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false)
        binding.addItem.setOnClickListener(addItemListener)

        return binding.root
    }

    private var addItemListener = View.OnClickListener {
        val intent = Intent(activity, CreateProjectActivity::class.java)
        startActivity(intent)
    }
}
