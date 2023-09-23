package com.example.kotlin_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity



@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          var cat = findViewById<ImageView>(R.id.cat)
          var dog = findViewById<ImageView>(R.id.dog)
          var coffee = findViewById<ImageView>(R.id.coffee)
          var parrot = findViewById<ImageView>(R.id.parrot)
          var android = findViewById<ImageView>(R.id.android)
          var scenery = findViewById<ImageView>(R.id.scenery)

        cat.setOnClickListener(View.OnClickListener {
            var second_activity = Intent(this@MainActivity, SecondActivity::class.java).also {
                it.putExtra("id",R.drawable.cat)
                startActivity(it)
            }
        })
        dog.setOnClickListener(View.OnClickListener {
            var second_activity = Intent(this@MainActivity, SecondActivity::class.java).also {
                it.putExtra("id",R.drawable.dog)
                startActivity(it)
            }
        })
        coffee.setOnClickListener(View.OnClickListener {
            var second_activity = Intent(this@MainActivity, SecondActivity::class.java).also {
                it.putExtra("id",R.drawable.coffee)
                startActivity(it)
            }
        })
        parrot.setOnClickListener(View.OnClickListener {
            var second_activity = Intent(this@MainActivity, SecondActivity::class.java).also {
                it.putExtra("id",R.drawable.parrot)
                startActivity(it)
            }
        })
        android.setOnClickListener(View.OnClickListener {
            var second_activity = Intent(this@MainActivity, SecondActivity::class.java).also {
                it.putExtra("id",R.drawable.android)
                startActivity(it)
            }
        })
        scenery.setOnClickListener(View.OnClickListener {
            var second_activity = Intent(this@MainActivity, SecondActivity::class.java).also {
                it.putExtra("id",R.drawable.scenery)
                startActivity(it)
            }
        })
        }
}