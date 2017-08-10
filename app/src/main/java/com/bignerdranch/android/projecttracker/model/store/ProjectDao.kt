package com.bignerdranch.android.projecttracker.model.store

import android.arch.persistence.room.*
import com.bignerdranch.android.projecttracker.model.Project
import io.reactivex.Single

@Dao
interface ProjectDao {
    @Insert
    fun insertProject(project: Project)

    @Update
    fun updateProject(project: Project)

    @Delete
    fun deleteProject(project: Project)

    @Query("SELECT * FROM project")
    fun getAllProjects(): Single<List<Project>>
}