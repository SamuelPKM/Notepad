package com.example.notepad.adaptador

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notepad.R
import com.example.notepad.noteStruc


class noteAdapter(private val misNotas:List<noteStruc>, private val onClickListener: (noteStruc) -> Unit) : RecyclerView.Adapter<noteViewHolder>(){
    //Regresa el tamano de la lista
    override fun getItemCount(): Int =  misNotas.size
    //Pinta los atributos en la pantalla
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): noteViewHolder{
        val layoutInflater = LayoutInflater.from(parent.context)
        return noteViewHolder(layoutInflater.inflate(R.layout.item_notes, parent,false))
    }
    override fun onBindViewHolder(holder: noteViewHolder, position: Int){
        val item = misNotas[position]
        holder.render(item,onClickListener)
    }
}