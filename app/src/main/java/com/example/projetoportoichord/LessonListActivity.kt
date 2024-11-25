package com.example.projetoportoichord

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LessonListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.begginer_lessons)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Lista de lições
        val lessons = listOf(
            LessonsView(
                name = "Conheça seu violão",
                description = "Conheça um pouco mais do seu instrumento",
                imageId = R.drawable.logo_small,
                isCompleted = false,
                difficultyLevel = "Iniciante"
            ),
            LessonsView(
                name = "Acordes Básicos",
                description = "Aprenda os acordes fundamentais.",
                imageId = R.drawable.logo_small,
                isCompleted = false,
                difficultyLevel = "Iniciante"
            ),
            LessonsView(
                name = "Sua primeira música",
                description = "Aprenda a tocar sua primeira música no violão.",
                imageId = R.drawable.logo_small,
                isCompleted = false,
                difficultyLevel = "Iniciante"
            )
        )

        // Configuração do RecyclerView
        Log.d("LessonListActivity", "Setting adapter with ${lessons.size} lessons")
        recyclerView.adapter = LessonAdapter(lessons)
    }
}