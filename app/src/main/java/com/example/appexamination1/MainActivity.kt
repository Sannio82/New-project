package com.example.appexamination1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var welcomeText : TextView
    lateinit var userName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        welcomeText = findViewById(R.id.welcomeText)
        welcomeText.text = "Skriv in ditt namn nedan"
        userName = findViewById(R.id.greeting)

        val buttonGeography = findViewById<Button>(R.id.geography)
        buttonGeography.text = "Geografi"
        buttonGeography.setOnClickListener {
            val intent = Intent(this, GeographyActivity::class.java)
            intent.putExtra("name", userName.text.toString())
            startActivity(intent)
            finish()
        }
        val buttonScience = findViewById<Button>(R.id.science)
        buttonScience.setOnClickListener {
            val intent = Intent(this, ScienceActivity2::class.java)
            intent.putExtra("name", userName.text.toString())
            startActivity(intent)
            finish()

        }

      /*  val buttonScience = findViewById<Button>(R.id.science)
        buttonScience.text = "Natur och vetenskap"
        buttonScience.setOnClickListener {  }

        val buttonFoodAndBevereges = findViewById<Button>(R.id.foodBeverages)
        buttonFoodAndBevereges.text = "Mat och dryck"
        buttonFoodAndBevereges.setOnClickListener {  }

        val buttonMixed = findViewById<Button>(R.id.mixed)
        buttonMixed.text = "Blandat"
        buttonMixed.setOnClickListener {  } */


    }


}