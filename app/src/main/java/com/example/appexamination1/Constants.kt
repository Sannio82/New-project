package com.example.appexamination1

import android.widget.TextView
import java.util.ArrayList

object Constants {

    fun getQuestions() : ArrayList<Question> {

        val questionsList= ArrayList<Question> ()

        val q1 = Question(
            1,
            "Vad heter Nicaraguas huvudstad?",
            "Managua",
            "San José",
            "Tegucigalpa",
            "Buenos aires",
            1)

        val q2 = Question(
            2,
            "Vad heter Bolivias huvudstad?",
            "Rio de Janeiro",
            "Lima",
            "Sucre",
            "Caracas",
            3)

        val q3 = Question(
            3,
            "Vilken är Sveriges största sjö?",
            "Mälaren",
            "Vänern",
            "Vättern",
            "Hjälmaren",
        2)

        questionsList.add(q1)
        questionsList.add(q2)
        questionsList.add(q3)
        return questionsList







    }
}