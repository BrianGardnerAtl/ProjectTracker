package com.bignerdranch.android.projecttracker.controller

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.bignerdranch.android.projecttracker.R
import com.bignerdranch.android.projecttracker.controller.list.CompletedListFragment
import com.bignerdranch.android.projecttracker.controller.list.ProjectListFragment
import com.bignerdranch.android.projecttracker.controller.list.TaskListFragment
import com.bignerdranch.android.projecttracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.bottomNavigation.setOnNavigationItemSelectedListener(bottomNavListener)

        if (savedInstanceState == null) {
            setupProjectsList()
        }
    }

    private var bottomNavListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.item_projects -> setupProjectsList()
            R.id.item_tasks -> setupTasksScreen()
            R.id.item_completed -> setupCompletedScreen()
            else -> {
                Log.d("WUT", "Didn't recognize the input")
                false
            }
        }
    }

    private fun setupProjectsList(): Boolean {
        swapFragment(ProjectListFragment())
        return true
    }

    private fun setupTasksScreen(): Boolean {
        swapFragment(TaskListFragment())
        return true
    }

    private fun setupCompletedScreen(): Boolean {
        swapFragment(CompletedListFragment())
        return true
    }

    private fun swapFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(binding.fragmentContainer.id, fragment)
                .commit()
    }
}
