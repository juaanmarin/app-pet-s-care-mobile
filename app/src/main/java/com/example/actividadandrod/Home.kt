package com.example.actividadandrod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun btnVolver(view: View) {
        Log.i("Ingresa","Ingresa desde el main")
        Toast.makeText(this, "Regresa", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,MainActivity::class.java)
        startActivity(miIntent)



    }



    fun btnPerfil(view: View) {
        Log.i("Ingresa","Ingresa desde el main")
        Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,Profile::class.java)
        startActivity(miIntent)
    }


}