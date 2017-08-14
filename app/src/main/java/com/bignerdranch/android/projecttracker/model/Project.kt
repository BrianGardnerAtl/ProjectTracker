package com.bignerdranch.android.projecttracker.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Project(var name: String = "") {
    @PrimaryKey(autoGenerate = true)
    var id = 0
    var importance = Importance.NORMAL
}