package com.example.projetoportoichord

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonAdapter (private val lessons: List<LessonsView>) : RecyclerView.Adapter<LessonAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val lessonImage: ImageView = view.findViewById(R.id.lessonImage)
        val lessonName: TextView = view.findViewById(R.id.lessonName)
        val lessonDescription: TextView = view.findViewById(R.id.lessonDescription)
        val lessonDifficulty: TextView = view.findViewById(R.id.lessonDifficulty)
        val lessonStatus: TextView = view.findViewById(R.id.lessonStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.lessons_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lesson = lessons[position]
        holder.lessonImage.setImageResource(lesson.imageId)
        holder.lessonName.text = lesson.name
        holder.lessonDescription.text = lesson.description
        holder.lessonDifficulty.text = "Nível: ${lesson.difficultyLevel}"
        holder.lessonStatus.text = if (lesson.isCompleted) "Concluído" else "Pendente"
        holder.lessonStatus.setTextColor(
            if (lesson.isCompleted) Color.GREEN else Color.RED
        )
    }

    override fun getItemCount(): Int = lessons.size
}