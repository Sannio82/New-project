package com.example.appexamination1

class QuestionScienceList() {

    val questionScienceList = mutableListOf<QuestionScience>()

    val questionScience = QuestionScience(1, "Hur många kolatomer innehåller en syreatom?", "1", "2",
    "3", "4", 2)



    fun getNewQuestionScience() : QuestionScience {
            if (questionScienceList.size == 0) {

            }
            val random = (0 until questionScienceList.size).random()

            val newQuestionScience = questionScienceList.removeAt(random)
            return newQuestionScience
        }


   /* fun getQuestionScience() : MutableList<QuestionScience> {

         //   val science = QuestionScience(1, "Hur många kolatomer innehåller en syreatom?", "1", "2",
           //     "3", "4", 2)
            questionScienceList.add(science)
            questionScienceList.add(QuestionScience(2, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
                "3-4", "4-5", 1))
            questionScienceList.add(QuestionScience(2, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
                "3-4", "4-5", 1))
            questionScienceList.add(QuestionScience(2, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
                "3-4", "4-5", 1))
            questionScienceList.add(QuestionScience(2, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
                "3-4", "4-5", 1))
            questionScienceList.add(QuestionScience(2, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
                "3-4", "4-5", 1))
            questionScienceList.add(QuestionScience(2, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
                "3-4", "4-5", 1))

        return questionScienceList


    } */


    }





