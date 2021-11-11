package com.example.appexamination1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "highScore_table")
data class HighScore (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") var name: String?,
    @ColumnInfo(name = "score") var score: String?
        ) {
}