package com.example.appexamination1

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GeographyActivity : AppCompatActivity() {

    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geography2)

        val listOfQuestions = mutableListOf<Question>()
        val listOfOption = mutableListOf<Option>()


        val q1 = Question(
            "Vad heter Nicaraguas huvudstad?", o1(
                "Managua", "San José",
                "Tegucigalpa", "Buenos Aires"
            ), "Managua"
        )
        val q2 = Question(
            "Vad heter Bolivias huvudstad?", Option(
                "Quito", "Sucre",
                "Rio de Janeiro", "Lima"
            ), "Sucre"
        )

        val o1 = Option ("Managua", "San José", "Tegucigalpa", "buenos Aires")
        listOfQuestions.add(q1)
        listOfQuestions.add(q2)

        listOfOption.add(o1)
        //val randomQuestion = listOfQuestions.shuffled().first()

        val buttonOption1 = findViewById<Button>(R.id.option1)
        val buttonOption2 = findViewById<Button>(R.id.option2)
        val buttonOption3 = findViewById<Button>(R.id.option3)
        val buttonOption4 = findViewById<Button>(R.id.option4)

        // showNewQuestion()


        fun showNewQuestion() {

            val randomQuestion = listOfQuestions.shuffled().first()
            text = findViewById<TextView>(R.id.question)
            text.text = randomQuestion.q

            val options =
            buttonOption1.text = randomQuestion.


        }

        //val questions = mutableListOf<Question>()

        //val randomQuestion = mutableListOf<Question>().shuffled().first()

        //fun showNewQuestion() {
        //  randomQuestion
    }
}

//fun showNewQuestion() {
//listOfQuestions = (q1...q2).random()
//secondNumber= (1..100).random()

//randomNumbers.text = "$firstNumber + $secondNumber"

//}


