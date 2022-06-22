package com.example.actividadandrod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class Veterinarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veterinarios)
    }

    fun btnRegresar(view: View) {
        Log.i("Ingresa","Regresa al tipo usuario")
        Toast.makeText(this, "Regresa al tipo usuario", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,TipoUser::class.java)
        startActivity(miIntent)
    }

    fun btnRegistroV(view: View) {
        Log.i("Ingresa","Login")
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,MainActivity::class.java)
        startActivity(miIntent)
    }
}