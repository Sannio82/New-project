package com.example.appexamination1

    class Answer(
        val option1: String,
        val option2: String,
        val option3: String,
        val option4: String
    )

    class Question(val q: String, val listOfAnswer: Answer)

