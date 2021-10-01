package com.example.appexamination1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val tvScore = findViewById<TextView>(R.id.tvScore)
        val buttonResultat = findViewById<Button>(R.id.buttonResult)
        val greeting = findViewById<TextView>(R.id.greeting)

        tvScore.text = "Dina poäng är $correctAnswers av $totalQuestions"

        if(correctAnswers >= 2) {
            greeting.text = "Snyggt jobbat!"
        }else if(correctAnswers <=1) {
            greeting.text = "Du får nog plugga på lite mer!"
        }

        buttonResultat.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}