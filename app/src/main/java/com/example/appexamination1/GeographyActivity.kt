package com.example.appexamination1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class GeographyActivity : AppCompatActivity() {

    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geography2)

        val questionsList = Constants.getQuestions()

        Log.i("Questions Size", "${questionsList.size}")

        val currentPosition = 1
        val question: Question = questionsList[currentPosition - 1]

        val option1 = findViewById<TextView>(R.id.option1)
        val option2 = findViewById<TextView>(R.id.option2)
        val option3 = findViewById<TextView>(R.id.option3)
        val option4 = findViewById<TextView>(R.id.option4)

        val tvProgress = findViewById<TextView>(R.id.tvProgress)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = currentPosition
        tvProgress.text = "$currentPosition" + "/" + progressBar.max

        val questionTextView = findViewById<TextView>(R.id.questionTextView)
        questionTextView.text = question.q
        option1.text = question.option1
        option2.text = question.option2
        option3.text = question.option3
        option4.text = question.option4

        val buttonAnswer = findViewById<Button>(R.id.btn_submit)
        buttonAnswer.setOnClickListener {
        showNewQuestion() }


    }

        fun showNewQuestion() {

            val questionsList = Constants.getQuestions()
            val randomQuestion = questionsList.shuffled().first()
            text = findViewById<TextView>(R.id.questionTextView)
            text.text = randomQuestion.q


        }

        //val questions = mutableListOf<Question>()

        //val randomQuestion = mutableListOf<Question>().shuffled().first()

        //fun showNewQuestion() {
        //  randomQuestion

    }



//fun showNewQuestion() {
//listOfQuestions = (q1...q2).random()
//secondNumber= (1..100).random()

//randomNumbers.text = "$firstNumber + $secondNumber"

//}


