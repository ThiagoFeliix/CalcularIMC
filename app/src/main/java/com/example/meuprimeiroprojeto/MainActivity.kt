package com.example.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val edtPeso: EditText = findViewById(R.id.edittext_peso)
        val edtaltura: EditText = findViewById(R.id.edittext_altura)
        val tvResultado: TextView = findViewById(R.id.txtMsg)

        btnCalculate.setOnClickListener {


            val alturaStr = edtaltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {

            val altura: Float = alturaStr.toFloat()
            val  peso: Float = pesoStr.toFloat()

            val alturaFinal: Float = altura * altura
            val result: Float = peso / alturaFinal

            val intent = Intent(this, ResultActivity::class.java)
                .apply {
                    putExtra("EXTRA_RESULT", result)
                }
            startActivity(intent)

        }else {
                Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()

            }



    }
        }}