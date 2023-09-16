package com.example.kotlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var number1 = intent.getIntExtra("Number_1",hashCode())
        var number2 = intent.getIntExtra("Number_2",hashCode())
        var operation = intent.getStringExtra("Operation")

        var num1 = findViewById<TextView>(R.id.number1).apply {
            text = "Number:1 = "+number1
        }
        var num2 = findViewById<TextView>(R.id.number2).apply {
            text = "Number:2 = "+number2
        }
        var operation_desc = findViewById<TextView>(R.id.operation).apply {
            text = "Selected operation is: "+ operation
        }
        number1 = number1.toInt()
        number2 = number2.toInt()
        var answer = 0

        if(operation=="+"){
            answer= number1+number2
        }
        if(operation=="-"){
            answer= number1-number2
        }
        if(operation=="x"){
            answer= number1*number2
        }
        if(operation=="/"){
            answer= number1/number2
        }
        var result_desc = findViewById<TextView>(R.id.result).apply {
            text ="RESULT = "+ answer
        }
    }
}

