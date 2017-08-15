package com.bignerdranch.android.projecttracker.inject

import com.bignerdranch.android.projecttracker.model.store.ProjectStore
import com.bignerdranch.android.projecttracker.model.store.dao.ProjectDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class StoreModule {
    @Provides
    @Singleton
    fun providesProjectStore(projectDao: ProjectDao): ProjectStore {
        return ProjectStore(projectDao)
    }
}