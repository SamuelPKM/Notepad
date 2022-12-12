package com.example.notepad

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notepad.adaptador.noteAdapter
import com.example.notepad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //noteProvider.misNotas
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

    }
     private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.rV1.layoutManager = LinearLayoutManager(this)
        binding.rV1.adapter = noteAdapter(noteProvider.misNotas)
        {noteStruc ->  onItemSelected(noteStruc)}
        binding.rV1.addItemDecoration(decoration)
    }
    fun  onItemSelected(noteStruc: noteStruc){
        Toast.makeText(this,noteStruc.titulo,Toast.LENGTH_SHORT).show()
    }

}