package com.example.notepad.adaptador

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notepad.R
import com.example.notepad.noteStruc

class noteViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val titulo = view.findViewById<TextView>(R.id.tvTitle)
    val texto = view.findViewById<TextView>(R.id.tvText)
    val fecha = view.findViewById<TextView>(R.id.tvDate)
    fun render(noteStruc: noteStruc){
        titulo.text = noteStruc.titulo
        texto.text = noteStruc.texto
        fecha.text = noteStruc.fecha
    }
}