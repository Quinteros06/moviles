package com.example.laboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnCreateContextMenuListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var numberWeight: EditText
    private lateinit var numberHeigth: EditText
    private lateinit var buttoncalculate: Button
    private lateinit var dato : TextView
    private lateinit var resultado : TextView
    private lateinit var informacion : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding()
        setLisener()
    }

    private fun binding(){
        numberWeight = findViewById(R.id.numberWeight)
        buttoncalculate = findViewById(R.id.buttoncalculate)
        numberHeigth = findViewById(R.id.numberWeight)
        dato = findViewById(R.id.dato)
        resultado = findViewById(R.id.resultado)
        informacion = findViewById(R.id.informacion)
    }

    private fun setLisener(){
        buttoncalculate.setOnClickListener{
            val numberpeso = numberWeight.text.toString()
            val numberaltura = numberHeigth.text.toString()

            if (numberpeso.isNullOrEmpty()){
                Toast.makeText(this, "no hay datos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (numberaltura.isNullOrEmpty()){
                Toast.makeText(this, "no hay datos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val dataresult = numberpeso.toFloat()/((numberaltura.toFloat()*numberaltura.toFloat())/1000)

            result(dataresult)
        }
    }

    private fun result(number: Float){
        if (number <= 18.5){
            resultado.text ="Muy mal"
        }
        if (number >= 18.5  && number <= 24.99){
            resultado.text ="aceptable"
        }
        if (number > 25 && number <= 29.99  ){
            resultado.text ="Exelente"
        }
        if (number <= 30){
            resultado.text ="sobre peso"
        }
    }
}