package com.example.appexamination1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HighScoreDao {

    @Insert
    fun insert(highScore: HighScore)

    @Delete
    fun delete(highScore: HighScore)

    @Query("SELECT * FROM highScore_table")
    fun getAll(): List<HighScore>

    @Query("SELECT * FROM highScore_table WHERE name LIKE :categoryName")
    fun findByCategory(categoryName: String) : List<HighScore>
}