package com.example.appexamination1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ScienceActivity : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var mQuestionScienceList = mutableListOf<QuestionScience>()
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    var currentQuestionScience : QuestionScience? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_science)

        val questionScienceTextView: TextView = findViewById(R.id.questionScienceTextView)

        //questionScienceTextView.text = QuestionScienceList.getNewQuestion()

    }
    /*fun loadNewQuestion(){
        currentQuestionScience  = mQuestionScienceList.getNewQuestion()

        wordTextView.text = currentWord?.swedish

    }*/



}