package com.st10077511.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailedActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed2)

        val btnExit = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener() {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}