package com.example.kotlin_app

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var hat = findViewById<CheckBox>(R.id.hat)
        var eyes = findViewById<CheckBox>(R.id.eyes)
        var ears = findViewById<CheckBox>(R.id.ears)
        var nose = findViewById<CheckBox>(R.id.nose)
        var arms = findViewById<CheckBox>(R.id.arms)
        var mouth = findViewById<CheckBox>(R.id.mouth)
        var shoes = findViewById<CheckBox>(R.id.shoes)
        var glasses = findViewById<CheckBox>(R.id.glasses)
        var eyebrows = findViewById<CheckBox>(R.id.eyebrows)
        var mustache = findViewById<CheckBox>(R.id.mustache)

        hat.setOnCheckedChangeListener { buttonView, isChecked ->
            val hat_img = findViewById<ImageView>(R.id.hat_img)
            if (isChecked) hat_img.visibility = View.VISIBLE else hat_img.visibility = View.INVISIBLE
        }
        eyes.setOnCheckedChangeListener { buttonView, isChecked ->
            val eyes_img = findViewById<ImageView>(R.id.eyes_img)
            if (isChecked)  eyes_img.visibility = View.VISIBLE else eyes_img.visibility = View.INVISIBLE
        }
        nose.setOnCheckedChangeListener { buttonView, isChecked ->
            val nose_img = findViewById<ImageView>(R.id.nose_img)
            if (isChecked) nose_img.visibility = View.VISIBLE else nose_img.visibility = View.INVISIBLE
        }
        ears.setOnCheckedChangeListener { buttonView, isChecked ->
            val ears_img = findViewById<ImageView>(R.id.ears_img)
            if (isChecked)  ears_img.visibility = View.VISIBLE else ears_img.visibility = View.INVISIBLE
        }
        eyebrows.setOnCheckedChangeListener { buttonView, isChecked ->
            val eyebrows_img = findViewById<ImageView>(R.id.eyebrows_img)
            if (isChecked)  eyebrows_img.visibility = View.VISIBLE else eyebrows_img.visibility = View.INVISIBLE
        }
        glasses.setOnCheckedChangeListener { buttonView, isChecked ->
            val glasses_img = findViewById<ImageView>(R.id.glasses_img)
            if (isChecked)  glasses_img.visibility = View.VISIBLE else glasses_img.visibility = View.INVISIBLE
        }
        mouth.setOnCheckedChangeListener { buttonView, isChecked ->
            val mouth_img = findViewById<ImageView>(R.id.mouth_img)
            if (isChecked)  mouth_img.visibility = View.VISIBLE else mouth_img.visibility = View.INVISIBLE
        }
        arms.setOnCheckedChangeListener { buttonView, isChecked ->
            val arms_img = findViewById<ImageView>(R.id.arms_img)
            if (isChecked)  arms_img.visibility = View.VISIBLE else arms_img.visibility = View.INVISIBLE
        }
        mustache.setOnCheckedChangeListener { buttonView, isChecked ->
            val mustache_img = findViewById<ImageView>(R.id.mustache_img)
            if (isChecked)  mustache_img.visibility = View.VISIBLE else mustache_img.visibility = View.INVISIBLE
        }
        shoes.setOnCheckedChangeListener { buttonView, isChecked ->
            val shoes_img = findViewById<ImageView>(R.id.shoes_img)
            if (isChecked)  shoes_img.visibility = View.VISIBLE else shoes_img.visibility = View.INVISIBLE
        }
    }
}