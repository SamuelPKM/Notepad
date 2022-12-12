package com.example.notepad.adaptador

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.notepad.databinding.ItemNotesBinding
import com.example.notepad.noteStruc

class noteViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemNotesBinding.bind(view)

    fun render(noteStruc: noteStruc, onClickListener: (noteStruc) -> Unit){
        binding.tvTitle.text = noteStruc.titulo
        binding.tvText.text = noteStruc.texto
        binding.tvDate.text = noteStruc.fecha

        itemView.setOnClickListener{
            onClickListener(noteStruc)
        }
    }
}