package com.st10077511.weatherapp

import android.content.Intent
import android.icu.util.Calendar.MONDAY
import android.icu.util.Calendar.WeekData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainScreenActivity2(intent: Intent) : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen2)


        val btnExit = findViewById<Button>(R.id.btnExit);
        btnExit.setOnClickListener() {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            }
        val btnDetailedView = findViewById<Button>(R.id.btnDetailedView)
        btnDetailedView.setOnClickListener() {
            val intent = Intent (this,DetailedActivity2::class.java)
            startActivity(intent)
        }
    }
    }





