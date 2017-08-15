package com.bignerdranch.android.projecttracker.model.store

import com.bignerdranch.android.projecttracker.model.Project
import com.bignerdranch.android.projecttracker.model.store.dao.ProjectDao
import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ProjectStore(val projectDao: ProjectDao) {

    fun insertProject(project: Project) {
        Completable.create { projectDao.insertProject(project) }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe()
    }
}