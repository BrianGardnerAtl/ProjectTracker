package com.bignerdranch.android.projecttracker.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity
class Task {
    @PrimaryKey(autoGenerate = true)
    var id = 0
    var name = ""
    @Ignore
    var dueDate: Date? = null
    @Ignore
    var completedDate: Date? = null
}