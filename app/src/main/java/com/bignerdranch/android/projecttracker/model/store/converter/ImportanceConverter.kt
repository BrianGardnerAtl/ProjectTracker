package com.bignerdranch.android.projecttracker.model.store.converter

import android.arch.persistence.room.TypeConverter
import com.bignerdranch.android.projecttracker.model.Importance

class ImportanceConverter {
    @TypeConverter
    fun importanceToString(importance: Importance): String {
        return importance.value
    }

    @TypeConverter
    fun stringToImportance(importance: String): Importance {
        return Importance.valueOf(importance)
    }
}