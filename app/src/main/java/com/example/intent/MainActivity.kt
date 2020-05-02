package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    /*private val dos=boton2
    private val tres=boton3
    private val cuatro=boton4*/
    //Función que llama al xml al iniciar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val btn1: Button = findViewById (R.id.boton1)
        val btn2: Button = findViewById(R.id.boton2)
        val btn3: Button = findViewById(R.id.boton3)
        val btn4: Button = findViewById(R.id.boton4)

        btn1.onClick {
            Log.d("Web","activado")
            browse("https://www.google.es")
        }

        btn2.onClick {
            Log.d("camara","activado")
        }

        btn3.onClick {
            Log.d("mate","activado")
            startActivity<ActividadMatematica>("id" to 5)
        }

        btn4.onClick {
            Log.d("nuevo","activado")

        }

    }
    }
