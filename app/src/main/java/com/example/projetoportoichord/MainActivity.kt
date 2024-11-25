package com.example.projetoportoichord

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.provider.Telephony.Mms.Intents
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia o ImageButton
        val imageButton = findViewById<ImageButton>(R.id.lesson_button_beginner)

        // Configura o clique
        imageButton.setOnClickListener {
            // Navega para a SecondActivity (Begginner_lessons)
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}