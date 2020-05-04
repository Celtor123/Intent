package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    //Función que llama al xml al iniciar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    Función que crea botones, los incializa a través de la id del xml
    y a través de sus pulsaciones inicia los retos
     */
    override fun onResume() {
        super.onResume()
        val btn1: Button = findViewById (R.id.boton1)
        val btn2: Button = findViewById(R.id.boton2)
        val btn3: Button = findViewById(R.id.boton3)
        val btn4: Button = findViewById(R.id.boton4)
        /*
        onClick para interacción al pulsar botones
        browse
         */
        btn1.onClick {
            Log.d("Web","activado")
            browse("https://www.google.es")
        }

        btn2.onClick {
            Log.d("mate","activado")
            startActivity<ActividadMatematica>()
        }

        btn3.onClick {
            Log.d("camara","activado")

        }

        btn4.onClick {
            Log.d("nuevo","activado")

        }

    }
    }
