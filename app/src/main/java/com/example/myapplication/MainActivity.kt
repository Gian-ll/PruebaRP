package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private val miViewModel: ContadorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvContador: TextView = findViewById(R.id.tvContador)
        val btnSumar: Button = findViewById(R.id.btnSumar)
        val btnRestar: Button = findViewById(R.id.btnRestar)

        miViewModel.numero.observe(this) { valorActualizado->
            tvContador.text = valorActualizado.toString()
        }

        btnSumar.setOnClickListener { miViewModel.incrementar() }
        btnRestar.setOnClickListener { miViewModel.decrementar() }
    }
}