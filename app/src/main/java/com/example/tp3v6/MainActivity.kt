package com.example.tp3v6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

fun mensajeError(){
    Toast.makeText (this,"Debe escribir su nombre !!! ", Toast.LENGTH_SHORT).show()
}

fun verificaEdit() = if (etNombre.text.isNotEmpty()){
    val intent = Intent(this, Pag2::class.java).apply {
        putExtra("INTENT_NAME",etNombre.text)
        startActivity(intent)
    }
}else{
    mensajeError()
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPag2.setOnClickListener{verificaEdit()}

    }
}