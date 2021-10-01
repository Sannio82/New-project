package com.example.appexamination1

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class ScienceActivity : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var questionScienceList= mutableListOf<QuestionScience>()
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    var currentQuestionScience : QuestionScience? = null
   /* lateinit var optionScience1 : TextView
    lateinit var optionScience2 : TextView
    lateinit var optionScience3 : TextView
    lateinit var optionScience4 : TextView */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_science)

        val questionScienceTextView: TextView = findViewById(R.id.questionScienceTextView)

         questionScienceList = getQuestionScience()

        var optionScience1 = findViewById<TextView>(R.id.optionScience1)
        optionScience1.setOnClickListener {
            selectedOptionView(optionScience1,1)
        }
        var optionScience2 = findViewById<TextView>(R.id.optionScience2)
        optionScience2.setOnClickListener {
            selectedOptionView(optionScience2, 2)
        }
        var optionScience3 = findViewById<TextView>(R.id.optionScience3)
        optionScience3.setOnClickListener {
            selectedOptionView(optionScience3, 3)
        }
        var optionScience4 = findViewById<TextView>(R.id.optionScience4)
        optionScience4.setOnClickListener {
            selectedOptionView(optionScience4, 4)
        }

        //val questionScience : QuestionScience = questionScienceList[mCurrentPosition -1] (Antagligen om man vill
        //köra frågorna i ordning. Sparar så länge.

       currentQuestionScience = questionScienceList.random() //Lyckades äntligen med randomfunktionen!

         // setQuestionScience()

        questionScienceTextView.text = currentQuestionScience!!.q
        optionScience1.text = currentQuestionScience!!.option1
        optionScience1.setOnClickListener {
            selectedOptionView(optionScience1, 1)
        }
        optionScience2.text = currentQuestionScience!!.option2
        optionScience2.setOnClickListener{
            selectedOptionView(optionScience2, 2)
        }
        optionScience3.text = currentQuestionScience!!.option3
        optionScience3.setOnClickListener{
            selectedOptionView(optionScience3, 3)
        }
        optionScience4.text = currentQuestionScience!!.option4
        optionScience4.setOnClickListener{
            selectedOptionView(optionScience4, 4)
        }

    //questionScienceTextView.text = QuestionScienceList.getNewQuestion()

        val buttonAnswer = findViewById<Button>(R.id.btn_submit2)
        buttonAnswer.setOnClickListener{

        }

       /* optionScience1  = findViewById<TextView>(R.id.optionScience1)
        optionScience1.setOnClickListener {
            selectedOptionView(optionScience1,1)
        }
        optionScience2 = findViewById<TextView>(R.id.optionScience2)
        optionScience2.setOnClickListener {
            selectedOptionView(optionScience2, 2)
        }
        optionScience3 = findViewById<TextView>(R.id.optionScience3)
        optionScience3.setOnClickListener {
            selectedOptionView(optionScience3, 3)
        }
        optionScience4 = findViewById<TextView>(R.id.optionScience4)
        optionScience4.setOnClickListener {
            selectedOptionView(optionScience4, 4)
        } */
    }
    /*fun loadNewQuestion(){
        currentQuestionScience  = mQuestionScienceList.getNewQuestion()

        wordTextView.text = currentWord?.swedish

    }*/

    fun getQuestionScience() : MutableList<QuestionScience> {

        //   val science = QuestionScience(1, "Hur många kolatomer innehåller en syreatom?", "1", "2",
        //     "3", "4", 2)

        questionScienceList.add(QuestionScience(1, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
            "3-4", "4-5", 1))
        questionScienceList.add(QuestionScience(2, "Hur många väteatomer innehåller en vattenmolekyl?", "1", "2",
            "3", "4", 2))
        questionScienceList.add(QuestionScience(3, "Vad har järn för betäckning i det periodiska systemet?", "Io", "J",
            "Fe", "Ir", 3))
        questionScienceList.add(QuestionScience(4, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
            "3-4", "4-5", 1))
        questionScienceList.add(QuestionScience(5, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
            "3-4", "4-5", 1))
        questionScienceList.add(QuestionScience(6, "Hur många ungar föder normalt en utter?", "1-2", "2-3",
            "3-4", "4-5", 1))

        return questionScienceList
    }

    private fun setQuestionScience() {

        val button = findViewById<Button>(R.id.btn_submit2)
        val question : QuestionScience = questionScienceList[mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == questionScienceList.size) {
            button.text = "SE RESULTAT"
        } else {
            button.text = "SVARA "
        }

        val optionScience1 = findViewById<TextView>(R.id.option1)
        val optionScience2 = findViewById<TextView>(R.id.option2)
        val optionScience3 = findViewById<TextView>(R.id.option3)
        val optionScience4 = findViewById<TextView>(R.id.option4)

        val tvProgress = findViewById<TextView>(R.id.tvProgress)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition" + "/" + progressBar.max

        val questionTextView = findViewById<TextView>(R.id.questionTextView)
        questionTextView.text = question.q
        optionScience1.text = question.option1
        optionScience2.text = question.option2
        optionScience3.text = question.option3
        optionScience4.text = question.option4

    }
    private fun defaultOptionsView() {

        val optionScience1 = findViewById<TextView>(R.id.option1)
        val optionScience2 = findViewById<TextView>(R.id.option2)
        val optionScience3 = findViewById<TextView>(R.id.option3)
        val optionScience4 = findViewById<TextView>(R.id.option4)


        val options = mutableListOf<TextView>()
        options.add(0, optionScience1)
        options.add(1, optionScience2)
        options.add(2, optionScience3)
        options.add(3, optionScience4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#FF000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg)
        }

    }
    private fun answerView(answer: Int, drawableView: Int) {

        val optionScience1 = findViewById<TextView>(R.id.option1)
        val optionScience2 = findViewById<TextView>(R.id.option2)
        val optionScience3 = findViewById<TextView>(R.id.option3)
        val optionScience4 = findViewById<TextView>(R.id.option4)

        when(answer) {
            1 ->{
                optionScience1.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            2 ->{
                optionScience2.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            3 ->{
                optionScience3.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            4 ->{
                optionScience4.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
        }
    }


    fun getNewQuestion() : QuestionScience{
        if (questionScienceList.size == 0) {
            getQuestionScience()
        }
        val random = (0 until questionScienceList.size).random()

        val newQuestion = questionScienceList.removeAt(random)
        return newQuestion
    }
    private fun selectedOptionView(textView: TextView, selectedOptionNumber: Int) {
        //defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg)

    }

}