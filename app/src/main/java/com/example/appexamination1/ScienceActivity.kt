package com.example.appexamination1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class ScienceActivity : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var questionScienceList= mutableListOf<QuestionScience>()
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    var currentQuestionScience : QuestionScience? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_science)

        val questionScienceTextView: TextView = findViewById(R.id.questionScienceTextView)

         questionScienceList = getQuestionScience()

        val optionScience1 = findViewById<TextView>(R.id.optionScience1)
        optionScience1.setOnClickListener {

        }
        val optionScience2 = findViewById<TextView>(R.id.optionScience2)
        optionScience2.setOnClickListener {

        }
        val optionScience3 = findViewById<TextView>(R.id.optionScience3)
        optionScience3.setOnClickListener {

        }
        val optionScience4 = findViewById<TextView>(R.id.optionScience4)
        optionScience4.setOnClickListener {

        }

        val questionScience : QuestionScience = questionScienceList[mCurrentPosition -1]

        questionScienceTextView.text = questionScience.q
        optionScience1.text = questionScience.option1
        optionScience2.text = questionScience.option2
        optionScience3.text = questionScience.option3
        optionScience4.text = questionScience.option4



        //questionScienceTextView.text = QuestionScienceList.getNewQuestion()

    }
    /*fun loadNewQuestion(){
        currentQuestionScience  = mQuestionScienceList.getNewQuestion()

        wordTextView.text = currentWord?.swedish

    }*/

    fun getQuestionScience() : MutableList<QuestionScience> {

        //   val science = QuestionScience(1, "Hur många kolatomer innehåller en syreatom?", "1", "2",
        //     "3", "4", 2)

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
    }

    private fun setQuestionScience() {

        val button = findViewById<Button>(R.id.btn_submit2)
        val question : QuestionScience = questionScienceList[mCurrentPosition - 1]

       // defaultOptionsView()

        if (mCurrentPosition == questionScienceList.size) {
            button.text = "SE RESULTAT"
        } else {
            button.text = "SVARA "
        }

        val option1 = findViewById<TextView>(R.id.option1)
        val option2 = findViewById<TextView>(R.id.option2)
        val option3 = findViewById<TextView>(R.id.option3)
        val option4 = findViewById<TextView>(R.id.option4)

        val tvProgress = findViewById<TextView>(R.id.tvProgress)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition" + "/" + progressBar.max

        val questionTextView = findViewById<TextView>(R.id.questionTextView)
        questionTextView.text = question.q
        option1.text = question.option1
        option2.text = question.option2
        option3.text = question.option3
        option4.text = question.option4

    }



}