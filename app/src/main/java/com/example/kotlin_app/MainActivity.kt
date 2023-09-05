package com.example.kotlin_app

//Please write your app's package name correctly on the first line

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt1 = findViewById<TextView>(R.id.txt1)
        val btn = findViewById<Button>(R.id.button1)
        btn.setOnClickListener{
            txt1.text = "You clicked the button"
        }
    }
}
