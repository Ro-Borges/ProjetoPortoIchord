package com.example.projetoportoichord

data class LessonsView (
    val name: String,
    val description: String,
    val imageId: Int, // ID do recurso de imagem
    val isCompleted: Boolean,
    val difficultyLevel: String // Ex.: "Iniciante", "Intermediário", "Avançado"
)