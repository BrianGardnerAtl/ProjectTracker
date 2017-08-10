package com.bignerdranch.android.projecttracker.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity
class Task {
    @PrimaryKey(autoGenerate = true)
    var id = 0
    var name = ""
    @ColumnInfo(name = "due_date")
    var dueDate: Date? = null
    @ColumnInfo(name = "completed_date")
    var completedDate: Date? = null
}