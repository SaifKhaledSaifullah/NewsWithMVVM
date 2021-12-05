package com.saif.newswithmvvm.db

import androidx.room.TypeConverter
import com.saif.newswithmvvm.model.Source

class Converter {
    @TypeConverter
    fun getString(source: Source): String = source.name

    @TypeConverter
    fun getSource(name: String): Source = Source(name, name)
}