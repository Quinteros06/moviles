package com.example.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.TextView
import java.math.BigDecimal
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    lateinit var five: ImageView;
    lateinit var ten: ImageView;
    lateinit var quart: ImageView;
    lateinit var dollar: ImageView;
    lateinit var cantidadtext: TextView;


    private var total :Double = 0.0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        five = findViewById(R.id.buttonfive)
        ten = findViewById(R.id.buttonten)
        quart = findViewById(R.id.buttonquart)
        dollar = findViewById(R.id.buttondollar)
        cantidadtext = findViewById(R.id.cant)

        listener()
    }

    private fun listener(){
        five.setOnClickListener{total += 0.05
            var round =(total*1000.0).roundToInt().toDouble()/1000.0
        cantidadtext.text = round.toString()}

        ten.setOnClickListener{total += 0.10
            var round =(total*1000.0).roundToInt().toDouble()/1000.0
            cantidadtext.text = round.toString()}

        quart.setOnClickListener{total += 0.25
            var round =(total*1000.0).roundToInt().toDouble()/1000.0
            cantidadtext.text = round.toString()}

        dollar.setOnClickListener{total += 1.00
            var round =(total*1000.0).roundToInt().toDouble()/1000.0
            cantidadtext.text = round.toString()}
    }


}