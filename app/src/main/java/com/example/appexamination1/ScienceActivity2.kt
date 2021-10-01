package com.example.appexamination1

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import java.util.ArrayList


class ScienceActivity2 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList = mutableListOf<QuestionScience>()
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    lateinit var option1 : TextView
    lateinit var option2 : TextView
    lateinit var option3 : TextView
    lateinit var option4 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geography2)


        option1 = findViewById<TextView>(R.id.option1)
        option2 = findViewById<TextView>(R.id.option2)
        option3 = findViewById<TextView>(R.id.option3)
        option4 = findViewById<TextView>(R.id.option4)

        val questionTextView = findViewById<TextView>(R.id.questionTextView)

        mQuestionsList = Constants.getQuestionsScience()

        setQuestion()

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)

        val button = findViewById<Button>(R.id.btn_submit)
        button.setOnClickListener(this)

        val tvProgress = findViewById<TextView>(R.id.tvProgress)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.max = mQuestionsList.size

        val mCurrentPosition = 1
        val question : QuestionScience = mQuestionsList[mCurrentPosition -1]

        progressBar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition" + "/" + progressBar.max

        ObjectAnimator.ofInt(progressBar, "progress", progressBar.progress)
            .setDuration(2000)
            .start()

        questionTextView.text = question.q
        option1.text = question.option1
        option2.text = question.option2
        option3.text = question.option3
        option4.text = question.option4
    }

    private fun setQuestion() {

        val question : QuestionScience = mQuestionsList[mCurrentPosition - 1]

        defaultOptionsView()

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

    private fun defaultOptionsView() {

        val options = mutableListOf<TextView>()
        options.add(0, option1)
        options.add(1, option2)
        options.add(2, option3)
        options.add(3, option4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#FF000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {

        when(v?.id) {

            R.id.option1 -> {
                selectedOptionView(option1, 1)
                backgroundcolor()
            }
            R.id.option2 -> {
                selectedOptionView(option2, 2)
                backgroundcolor()
            }
            R.id.option3 -> {
                selectedOptionView(option3, 3)
                backgroundcolor()
            }
            R.id.option4 -> {
                selectedOptionView(option4, 4)
                backgroundcolor()
            }
            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            goToResult()
                        }
                    }
                }

            }
        }

    }

    private fun answerView(answer: Int, drawableView: Int) {

        when(answer) {
            1 ->{
                option1.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            2 ->{
                option2.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            3 ->{
                option3.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            4 ->{
                option4.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
        }
    }

    private fun selectedOptionView(textView: TextView, selectedOptionNumber: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg)

    }

    fun backgroundcolor() {
        val question: QuestionScience = mQuestionsList[mCurrentPosition - 1]

        if (question.correctAnswer != mSelectedOptionPosition) {
            answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
        } else {
            mCorrectAnswers++
            answerView(mSelectedOptionPosition, R.drawable.correct_option_border_bg)
        }
        mSelectedOptionPosition = 0
    }

        fun goToResult() {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
        intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
        startActivity(intent)
        finish()
    }
}












