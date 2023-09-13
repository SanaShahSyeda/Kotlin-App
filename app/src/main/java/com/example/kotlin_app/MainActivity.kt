package com.example.kotlin_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var count=1
        var cream="NO"
        var chocolate="NO"
        var price = 4.0;
        setContentView(R.layout.activity_main)
        var plus = findViewById<Button>(R.id.plus)
        var minus = findViewById<Button>(R.id.minus)
        var order = findViewById<Button>(R.id.order)
        var cream_topping = findViewById<CheckBox>(R.id.cream)
        var quantity = findViewById<TextView>(R.id.quantity_value)
        var chocolate_topping = findViewById<CheckBox>(R.id.chocolate)
        var order_summary = findViewById<TextView>(R.id.order_summary)

        plus.setOnClickListener(View.OnClickListener {
            count++
            quantity.setText("$count")
        })
        minus.setOnClickListener(View.OnClickListener {
            if(count!=1){
                count--
                quantity.setText("$count")
            }
        })
        order.setOnClickListener(View.OnClickListener {
            if(cream_topping.isChecked) {
                cream= "YES"
                price = price + 0.5
            }
            if(chocolate_topping.isChecked){
                chocolate="YES"
                price = price + 1.0
            }
            order_summary.text=
                "\nAdd whipped cream ?$cream\n Add Chocolate?$chocolate\n Quanity$count\n\n Price:$$price\n THANKYOU !! "
        })
    }
}