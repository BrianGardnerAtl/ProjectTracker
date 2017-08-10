package com.bignerdranch.android.projecttracker.controller

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.bignerdranch.android.projecttracker.R
import com.bignerdranch.android.projecttracker.databinding.ActivitySingleFragmentBinding

abstract class SingleFragmentActivity : AppCompatActivity() {

    lateinit var binding: ActivitySingleFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_single_fragment)
        setupFragment()
    }

    abstract fun getFragment(): Fragment

    private fun setupFragment() {
        supportFragmentManager.beginTransaction()
                .add(binding.fragmentContainer.id, getFragment())
                .commit()
    }
}