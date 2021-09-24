package com.example.appexamination1

import android.widget.TextView
import java.util.ArrayList

object Constants {

        val TOTAL_QUESTIONS: String = "Totalt"
        val CORRECT_ANSWERS: String = "Correct answers"

    fun getQuestions() : MutableList<QuestionGeography> {

        val questionsGeographyList= mutableListOf<QuestionGeography>()

        val q1 = QuestionGeography(
            1,
            "Vad heter Nicaraguas huvudstad?",
            "Managua",
            "San José",
            "Tegucigalpa",
            "Buenos aires",
            1)

        val q2 = QuestionGeography(
            2,
            "Vad heter Bolivias huvudstad?",
            "Rio de Janeiro",
            "Lima",
            "Sucre",
            "Caracas",
            3)

        val q3 = QuestionGeography(
            3,
            "Vilken är Sveriges största sjö?",
            "Mälaren",
            "Vänern",
            "Vättern",
            "Hjälmaren",
        2)

        questionsGeographyList.add(q1)
        questionsGeographyList.add(q2)
        questionsGeographyList.add(q3)
        questionsGeographyList.add(QuestionGeography(4, "Vad heter den största parken i Mexiko City?", "Parque Central",
        "Chapultepec", "Plaza del sol", "Parque hundido", 2))
        //questionsList.add(QuestionGeography(, "", "",
          //  "", "", "", ))

        return questionsGeographyList







    }
}