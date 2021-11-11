package com.example.appexamination1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.appexamination1.databinding.ActivityResultBinding
import kotlinx.coroutines.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.coroutines.CoroutineContext

class ResultActivity : AppCompatActivity(), CoroutineScope {

    private lateinit var binding : ActivityResultBinding
    private lateinit var job : Job
    private lateinit var db : AppDatabase
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job
  //  private var highScore: ListView? = null
    var highScoreList =mutableListOf<HighScore>()
    private lateinit var highScoreAdapter : Adapter
    private var sortAscending = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        job = Job()

        var userName = intent.getStringExtra("name")
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val tvScore = findViewById<TextView>(R.id.tvScore)
        val buttonResultat = findViewById<Button>(R.id.buttonResult)
        val greeting = findViewById<TextView>(R.id.greeting)

        val highScore = findViewById<RecyclerView>(R.id.highScore)
        highScore.layoutManager = LinearLayoutManager(this)

        val number = HighScore(0, "$userName", "$correctAnswers")
        val highScoreAdapter = Adapter(this, highScoreList as ArrayList<HighScore>)


        tvScore.text = "$userName! Dina poäng är $correctAnswers av $totalQuestions"

        db = Room.databaseBuilder(applicationContext,
            AppDatabase::class.java, "HighScore")
            .fallbackToDestructiveMigration()
            .build()



        saveScore(number)
        highScore.adapter = highScoreAdapter


      /*  highScoreAdapter = Adapter(Activity(), highScoreList)
        highScore.adapter = highScoreAdapter
       // loadAllScores()


       */

        launch {
            val scoreList = loadAllScores().await()
            highScoreList.addAll(scoreList)
            highScoreAdapter.notifyDataSetChanged()
            for (number in highScoreList) {
                Log.d("!!!", "onCreate: $number")
            }

        }


        if(correctAnswers >= 2) {
            greeting.text = "Snyggt jobbat!"
        }else if(correctAnswers <=1) {
            greeting.text = "Du får nog plugga på lite mer!"
        }

        buttonResultat.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }


    override fun onDestroy() {
        job.cancel()
            super.onDestroy()
    }

    fun saveScore(highScore : HighScore) {

        launch(Dispatchers.IO) {
            db.HighScoreDao().insert(highScore)
        }
    }
    fun loadAllScores() : Deferred<List<HighScore>> =
        async(Dispatchers.IO)
    {
        db.HighScoreDao().getAll()

    }

}