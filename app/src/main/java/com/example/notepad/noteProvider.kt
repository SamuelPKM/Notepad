package com.example.notepad

class noteProvider {
    companion object{
        val misNotas = listOf<noteStruc>(
            noteStruc("Bienvenida","Espero te guste esta aplicacion sencilla amor", "14/10/22"),
            noteStruc("Como se usa?", "Facil solo tendras que anadir notas y podras " +
                    "verlas como si estuvieras en una pagina de facebook jejeje, luego de eso pondre " +
                    "un apartado para que para cada notita escojas una imagen... al menos ya es funcional jeje","12/10/22"),
            noteStruc("Despedida","Esta app esta siendo desarrollada pensando en ti, Te amo","05/09/21")
        )
    }
}