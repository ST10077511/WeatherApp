package com.st10077511.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMain = findViewById<Button>(R.id.btnMain)
        btnMain.setOnClickListener() {
            val intent = Intent(this, MainScreenActivity2::class.java)
            startActivity(intent)
        }

        val btnExit = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener() {
            val intent = Intent(this, MainScreenActivity2::class.java)
            startActivity(intent)
        }
    }
}