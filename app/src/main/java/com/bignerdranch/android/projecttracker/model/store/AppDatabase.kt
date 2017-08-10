package com.bignerdranch.android.projecttracker.model.store

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.bignerdranch.android.projecttracker.model.Project
import com.bignerdranch.android.projecttracker.model.Task
import com.bignerdranch.android.projecttracker.model.store.converter.DateConverter
import com.bignerdranch.android.projecttracker.model.store.converter.ImportanceConverter

@Database(entities = arrayOf(Project::class, Task::class),
          version = 1)
@TypeConverters(ImportanceConverter::class, DateConverter::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun projectDao(): ProjectDao
    abstract fun taskDao(): TaskDao
}