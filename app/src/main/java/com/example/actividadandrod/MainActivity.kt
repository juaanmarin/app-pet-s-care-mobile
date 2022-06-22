package com.example.actividadandrod


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnLogin(view: View) {


            Log.i("Ingresa","Ingresa desde el Login")
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,Home::class.java)
        startActivity(miIntent)



    }

    fun btnTipo(view: View) {

        Log.i("Ingresa","Registro")
        Toast.makeText(this, "presiona Registro", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this,TipoUser::class.java)
        startActivity(miIntent)
    }
}