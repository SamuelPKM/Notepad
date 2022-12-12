package com.example.notepad

class noteProvider {
    companion object{
        val misNotas = listOf<noteStruc>(
            noteStruc("Bienvenido","Espero te guste esta aplicacion sencilla usando POO en kotlin", "14/10/22"),
            noteStruc("Como se usa?", "Facil solo tendras que anadir notas y podras " +
                    "verlas como si estuvieras en una pagina de facebook jejeje","12/10/22"),
            noteStruc("Despedida","Esta app esta siendo desarrollada pensando Como proyecto de POO","05/09/21")
        )
    }
}