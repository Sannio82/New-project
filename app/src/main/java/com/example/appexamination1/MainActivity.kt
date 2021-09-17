package com.example.appexamination1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var welcomeText : TextView
    lateinit var palmTree : ImageView
    lateinit var drink : ImageView
    lateinit var formula : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeText = findViewById(R.id.welcomeText)
        welcomeText.text = "Välj kategori och lycka till!"

        val buttonGeography = findViewById<Button>(R.id.geography)
        buttonGeography.text = "Geografi"
        buttonGeography.setOnClickListener {
            val intent = Intent(this, Geography::class.java)
            startActivity(intent)

        }

        val buttonScience = findViewById<Button>(R.id.science)
        buttonScience.text = "Natur och vetenskap"
        buttonScience.setOnClickListener {  }

        val buttonFoodAndBevereges = findViewById<Button>(R.id.foodBeverages)
        buttonFoodAndBevereges.text = "Mat och dryck"
        buttonFoodAndBevereges.setOnClickListener {  }

        val buttonMixed = findViewById<Button>(R.id.mixed)
        buttonMixed.text = "Blandat"
        buttonMixed.setOnClickListener {  }


    }


}