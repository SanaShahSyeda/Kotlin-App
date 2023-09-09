package com.example.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.compose.ui.res.stringResource

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count=0
        var toastbtn = findViewById<Button>(R.id.toastbtn)
        var countbtn = findViewById<Button>(R.id.countbtn)
        var counter  = findViewById<TextView>(R.id.counter)
        toastbtn.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "Hello Toast", Toast.LENGTH_SHORT).show()
        })
        countbtn.setOnClickListener(View.OnClickListener {
            count++;
            counter.setText("$count")
        })
    }
}