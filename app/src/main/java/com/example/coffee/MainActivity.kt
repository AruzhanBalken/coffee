package com.example.coffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cream = findViewById<CheckBox>(R.id.cream)
        var choco = findViewById<CheckBox>(R.id.choco)
        var sum = findViewById<TextView>(R.id.sum)
        var quantity = findViewById<TextView>(R.id.quantity)
        var price = 4.00
//        cream.setOnClickListener(){
//            cream.isChecked
//            sum.append("Add whipped cream? yes")
//        }
//        choco.setOnClickListener(){
//            choco.isChecked
//            sum.append("Add chocolate? yes")
//        }
        val minus = findViewById<Button>(R.id.minus)
        val plus = findViewById<Button>(R.id.plus)

        minus.setOnClickListener(){
        var i = Integer.parseInt(quantity.text.toString())
            i=i-1
            quantity.setText("$i")
        }
        plus.setOnClickListener(){
            var i = Integer.parseInt(quantity.text.toString())
            i=i+1
            quantity.setText("$i")
        }
        val order = findViewById<Button>(R.id.order)
        order.setOnClickListener(){
            var i = Integer.parseInt(quantity.text.toString())
            price = i*price

            if(cream.isChecked){
                sum.append("Add whipped cream? yes \n")
                price = price + 1.00
            }
            else if(choco.isChecked){
                sum.append("Add chocolate? yes \n")
                price = price + 0.50
            }
          

            sum.append("Quantity: ${quantity.text} \n Price: $price \n THANK YOU")
        }

    }

}