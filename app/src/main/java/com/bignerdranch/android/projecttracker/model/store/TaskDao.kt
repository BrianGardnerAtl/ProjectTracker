package com.bignerdranch.android.projecttracker.model.store

import android.arch.persistence.room.*
import com.bignerdranch.android.projecttracker.model.Task
import io.reactivex.Flowable

@Dao
interface TaskDao {
    @Insert
    fun insertTask(task: Task)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteTask(task: Task)

    @Query("SELECT * FROM task")
    fun getAllTasks(): Flowable<Task>
}