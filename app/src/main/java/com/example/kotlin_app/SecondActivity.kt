package com.example.kotlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

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

        var save_button = findViewById<Button>(R.id.save)
        save_button.setOnClickListener(View.OnClickListener {
            callFirstAcivity()
        })
    }

    private fun callFirstAcivity(){
        val first_activity =  Intent(this@SecondActivity, MainActivity::class.java).also {
            val name_txt=  findViewById<TextView>(R.id.name)
            val name = name_txt.text.toString()
            val email_txt=  findViewById<TextView>(R.id.email)
            val email = email_txt.text.toString()
            val department_txt=  findViewById<TextView>(R.id.department)
            val department = department_txt.text.toString()
            it.putExtra("Name", name)
            it.putExtra("Email", email)
            it.putExtra("Department",department)
            startActivity(it)
        }
    }
}

