package com.bignerdranch.android.projecttracker.inject

import dagger.Component

@Component(modules = arrayOf(AppModule::class, DatabaseModule::class))
interface AppComponent {
}