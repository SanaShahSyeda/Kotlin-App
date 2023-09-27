package com.example.kotlin_app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar: Toolbar = findViewById(R.id.tool_bar)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.options_menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when(item.itemId) {
            R.id.main_courses -> {
                    // Toast.makeText(this,"Main Courses item is selected", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@MainActivity, Main_Courses::class.java).also{
                        startActivity(it)
                    }
                    return true
            }
            R.id.appetizers-> {
                // Toast.makeText(this,"Appetizers item is selected", Toast.LENGTH_SHORT).show()
                val intent= Intent(this@MainActivity, Appetizers::class.java).also {
                    startActivity(it)
                }
                return true
            }
            R.id.desserts -> {
                // Toast.makeText(this,"Desserts item is selected", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, Desserts::class.java).also {
                    startActivity(it)
                }
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}


