package com.example.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var img_result = findViewById<ImageView>(R.id.resulting_image)
        var resourceID = intent.getIntExtra("id",0)
        img_result.setImageResource(resourceID)
    }
}

