package com.example.laboratorio04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.Placeholder
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: TextInputEditText
    private lateinit var editTextEmail: TextInputEditText
    private lateinit var editTextNumer: TextInputEditText
    private lateinit var buttonsave: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.namee)
        editTextEmail = findViewById(R.id.emaill)
        editTextNumer = findViewById(R.id.numeroo)

        guardar()
    }

    private fun guardar(){
        findViewById<Button>(R.id.buttonsave).setOnClickListener{
            val intent = Intent(this, secundario:: class.java)
            intent.putExtra("name", editTextName.text)
            intent.putExtra("Email", editTextEmail.text)
            intent.putExtra("Número", editTextNumer.text)
            startActivity(intent)
        }
    }

}