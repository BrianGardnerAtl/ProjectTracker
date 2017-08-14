package com.bignerdranch.android.projecttracker.controller.create.project

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.projecttracker.R
import com.bignerdranch.android.projecttracker.databinding.FragmentCreateProjectBinding
import com.bignerdranch.android.projecttracker.extension.graph
import com.bignerdranch.android.projecttracker.model.Project
import com.bignerdranch.android.projecttracker.model.store.ProjectDao
import javax.inject.Inject

class CreateProjectFragment : Fragment() {

    lateinit var binding: FragmentCreateProjectBinding
    @Inject
    lateinit var projectDao: ProjectDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context.graph.inject(this)
        activity.setTitle(R.string.create_project_title)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_create_project, container, false)
        binding.saveProject.setOnClickListener(saveListener)

        return binding.root
    }

    private val saveListener = View.OnClickListener {
        saveNewProject()
    }

    private fun saveNewProject() {
        val projectName = binding.projectName.text.toString()
        if (projectName.isNotEmpty()) {
            val project = Project(projectName)
            projectDao.insertProject(project)
            activity.finish()
        }
    }
}