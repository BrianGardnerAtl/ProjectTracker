package com.bignerdranch.android.projecttracker.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey

@Entity
class Project {
    @PrimaryKey(autoGenerate = true)
    var id = 0
    var name = ""
    @Ignore
    var importance = Importance.NORMAL
}