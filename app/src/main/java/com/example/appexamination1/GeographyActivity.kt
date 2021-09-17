package com.example.appexamination1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Geography : AppCompatActivity() {

    lateinit var text: TextView
    //val listOfAnswers = mutableListOf<Answer>() Vet ej om denna kommer behövas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geography)

            val listOfQuestions = mutableListOf<Question>()


            val q1 = Question("Vad heter Nicaraguas huvudstad?", Answer("Managua", "San José",
                "Tegucigalpa", "Buenos Aires") )
            val q2 = Question("Vad heter Bolivias huvudstad?", Answer("Quito", "Sucre",
                "Rio de Janeiro", "Lima") )

            listOfQuestions.add(q1)
            listOfQuestions.add(q2)


        val questions = listOf("q1", "q2")
        val randomQuestion = questions.shuffled().first()

        text = findViewById<TextView>(R.id.question)
        text.text = randomQuestion

        showNewQuestion()
    }

    val questions = listOf("q1", "q2")
    val randomQuestion = questions.shuffled().first()
    fun showNewQuestion() {
        randomQuestion
    }


    //fun showNewQuestion() {
        //listOfQuestions = (q1...q2).random()
        //secondNumber= (1..100).random()

        //randomNumbers.text = "$firstNumber + $secondNumber"

    }


class Question (val q : String, val listOfAnswer: Answer)

class Answer (val option1: String, val option2: String, val option3: String, val option4: String)