package com.bignerdranch.android.projecttracker.model.store.converter

import android.arch.persistence.room.TypeConverter
import java.util.*

class DateConverter {
    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        value?.let {
            return Date(value)
        }
        return null
    }
}