package com.example.kotlin_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity



@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var click = findViewById<Button>(R.id.click)
        click.setOnClickListener(View.OnClickListener{
            callSecondActivity()
        })
    }
    private fun callSecondActivity(){
        var num1 = findViewById<EditText>(R.id.number_1)
        var num2 = findViewById<EditText>(R.id.number_2)
        var number1 = num1.text.toString().toInt()
        var number2 = num2.text.toString().toInt()
        var selected_operation=""

        radioGroup = findViewById(R.id.radio_group)
        var id: Int = radioGroup.checkedRadioButtonId
        if (id != -1){
            var radio: RadioButton = findViewById(id)
            selected_operation = radio.text.toString()
        }
        val second_activity=  Intent(this@MainActivity, SecondActivity::class.java).also {
            it.putExtra("Number_1", number1)
            it.putExtra("Number_2", number2)
            it.putExtra("Operation",selected_operation)
            startActivity(it)
        }
    }
}