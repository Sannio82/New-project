package com.example.appexamination1

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [HighScore::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun HighScoreDao() : HighScoreDao
}