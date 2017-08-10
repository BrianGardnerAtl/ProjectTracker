package com.bignerdranch.android.projecttracker.inject

import android.arch.persistence.room.Room
import android.content.Context
import com.bignerdranch.android.projecttracker.model.store.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {
    @Provides
    fun providesDatabase(context: Context, databaseName: String): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, databaseName).build()
    }
}