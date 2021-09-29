package com.example.appexamination1

import android.widget.TextView
import java.util.ArrayList

object Constants {

        val TOTAL_QUESTIONS: String = "Totalt"
        val CORRECT_ANSWERS: String = "Correct answers"



    fun getQuestions(): MutableList<QuestionGeography> {
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

       return questionsGeographyList
    }
    fun getQuestionsScience() : MutableList<QuestionScience> {

        val questionsScienceList= mutableListOf<QuestionScience>()

        val qS1 = QuestionScience(
            1,
            "Hur många ungar föder normalt en utter?",
            "1-2",
            "2-3",
            "3-4",
            "4-5",
            1)

        val qS2 = QuestionScience(
            2,
            "Hur många väteatomer innehåller en vattenmolekyl?",
            "1",
            "2",
            "3",
            "4",
            2)

        val qS3 = QuestionScience(
            3,
            "Vad har järn för beteckning i det periodiska systemet?",
            "Io",
            "J",
            "Fe",
            "Ir",
            3)

        questionsScienceList.add(qS1)
        questionsScienceList.add(qS2)
        questionsScienceList.add(qS3)
        questionsScienceList.add(QuestionScience(4, "Vad heter sälens barn", "Kid",
            "Kut", "Kalv", "Unge", 2))


        return questionsScienceList

    }

  /*  fun initializeWords() {
        val word = Word("Hello", "Hej")
        wordList.add(word)
        wordList.add(Word("No", "Nej"))
        wordList.add(Word("Orange", "Apelsin"))
        wordList.add(Word("Computer", "Dator"))
        wordList.add(Word("Tree", "Träd"))
        wordList.add(Word("Drawer", "Byrå"))
    } */

}