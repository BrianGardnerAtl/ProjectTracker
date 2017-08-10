package com.bignerdranch.android.projecttracker.model.store

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.bignerdranch.android.projecttracker.model.Project
import com.bignerdranch.android.projecttracker.model.Task

@Database(entities = arrayOf(Project::class, Task::class),
          version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun projectDao(): ProjectDao
    abstract fun taskDao(): TaskDao
}