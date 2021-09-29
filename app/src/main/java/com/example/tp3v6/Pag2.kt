package com.example.tp3v6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pag2.*

class Pag2 : AppCompatActivity() {

    fun leeMuestra(){
        val relacion = intent.extras
        val nombre = relacion?.get("INTENT_NAME")
        tvhola.text = "Bienvenido/a al primer programa de Android $nombre"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pag2)

        btn2.setOnClickListener{onBackPressed()}
        leeMuestra()
    }
}