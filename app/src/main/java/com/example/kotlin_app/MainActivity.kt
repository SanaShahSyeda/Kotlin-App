package com.example.kotlin_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var click = findViewById<Button>(R.id.save)
        click.setOnClickListener(View.OnClickListener{
            callSecondActivity()
        })

        responseFromSecondActiviy()
    }
    private fun callSecondActivity(){
        var name = findViewById<EditText>(R.id.name)
        var email = findViewById<EditText>(R.id.email)
        var department = findViewById<EditText>(R.id.department)

        var name_text =  name.text.toString()
        var email_text = email.text.toString()
        var department_text = department.text.toString()


        val second_activity=  Intent(this@MainActivity, SecondActivity::class.java).also {
            it.putExtra("Name", name_text)
            it.putExtra("Email", email_text)
            it.putExtra("Department",department_text)
            startActivity(it)
        }
    }

    private fun responseFromSecondActiviy(){
        var name = intent.getStringExtra("Name")
        var email = intent.getStringExtra("Email")
        var department = intent.getStringExtra("Department")

        var name_txt = findViewById<TextView>(R.id.name).apply {
            text = name
        }
        var num2 = findViewById<TextView>(R.id.email).apply {
            text = email
        }
        var operation_desc = findViewById<TextView>(R.id.department).apply {
            text = department
        }
    }
}