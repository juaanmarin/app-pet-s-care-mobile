package com.example.actividadandrod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class TipoUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_user)
    }

    fun btnUsuario(view: View) {

        Log.i("Ingresa","Ingresa desde el home")
        Toast.makeText(this, "usuario", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,RegistroUsuarios::class.java)
        startActivity(miIntent)
    }

    fun btnVeterinario(view: View) {
        Log.i("Ingresa","Ingresa veterinario")
        Toast.makeText(this, "veterinario", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,Veterinarios::class.java)
        startActivity(miIntent)
    }

    fun btnClinica(view: View) {
        Log.i("Ingresa","Ingresa clinica")
        Toast.makeText(this, "clinica", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,Clinica::class.java)
        startActivity(miIntent)
    }

}