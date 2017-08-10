package com.bignerdranch.android.projecttracker.inject

import android.arch.persistence.room.Room
import android.content.Context
import com.bignerdranch.android.projecttracker.model.store.AppDatabase
import com.bignerdranch.android.projecttracker.model.store.ProjectDao
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class DatabaseModule {
    @Provides
    fun providesProjectDao(database: AppDatabase): ProjectDao {
        return database.projectDao()
    }

    // Implementation details
    @Provides
    fun providesDatabase(context: Context, @Named("database_file") databaseName: String):
            AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, databaseName).build()
    }

    @Provides
    @Named("database_file")
    fun providesDatabaseFileName(): String {
        return "project_tracker_database"
    }
}