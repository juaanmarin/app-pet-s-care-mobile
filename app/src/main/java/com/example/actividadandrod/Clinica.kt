package com.example.actividadandrod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class Clinica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinica)
    }

    fun btnVolver(view: View) {
        Log.i("Ingresa","Regresa")
        Toast.makeText(this, "Regresa", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,TipoUser::class.java)
        startActivity(miIntent)
    }

    fun btnRegistroC(view: View) {

        Log.i("Ingresa","Registrado con exito")
        Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,MainActivity::class.java)
        startActivity(miIntent)
    }
}