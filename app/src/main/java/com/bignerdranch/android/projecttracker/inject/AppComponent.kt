package com.bignerdranch.android.projecttracker.inject

import android.app.Application
import dagger.Component

@Component(modules = arrayOf(AppModule::class, DatabaseModule::class))
interface AppComponent: AppGraph {

    object Initializer {
        fun init(application: Application): AppGraph {
            return DaggerAppComponent.builder()
                    .appModule(AppModule(application))
                    .build()
        }
    }
}