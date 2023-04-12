package com.example.laboratorio04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class secundario : AppCompatActivity() {
    private lateinit var placeholdername : TextView
    private lateinit var placeholderemail: TextView
    private lateinit var placeholdernumber: TextView
    private lateinit var  btncompartir: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundario)

        placeholdername = findViewById(R.id.placeholdername)
        placeholderemail = findViewById(R.id.placeholderemail)
        placeholdernumber = findViewById(R.id.placeholdernumber)
        btncompartir = findViewById(R.id.btncompartir)


        val name = intent.getStringExtra("name").toString()
        val mail = intent.getStringExtra("Email").toString()
        val number = intent.getStringExtra("Número").toString()

        placeholdername.text = name
        placeholderemail.text = mail
        placeholdernumber.text = number

        compartir()

    }

    private fun compartir(){
        var text = placeholdername.text.toString() + "\n"+placeholderemail.text.toString() + "\n"+placeholdernumber.text.toString()
        btncompartir.setOnClickListener{
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,  text)
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "text")
            startActivity(Intent.createChooser(shareIntent, "text"))
        }
    }
}