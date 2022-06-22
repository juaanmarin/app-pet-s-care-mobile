package com.example.actividadandrod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class RegistroUsuarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_usuarios)
    }

    fun btnVolver(view: View) {
        Log.i("Ingresa","Ingresa desde el main")
        Toast.makeText(this, "Regresa", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,TipoUser::class.java)
        startActivity(miIntent)
    }

    fun btnInicio(view: View) {
        Log.i("Ingresa","Ingresa desde el main")
        Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,MainActivity::class.java)
        startActivity(miIntent)
    }
}