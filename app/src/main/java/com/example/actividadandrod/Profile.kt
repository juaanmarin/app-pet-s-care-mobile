package com.example.actividadandrod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun btnVolverHome(view: View) {
        Log.i("Ingresa","Ingresa desde el main")
        Toast.makeText(this, "presiona en el main", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,Home::class.java)
        startActivity(miIntent)
    }

}