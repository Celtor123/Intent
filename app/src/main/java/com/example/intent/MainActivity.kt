package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

/*private val dos=boton2
private val tres=boton3
private val cuatro=boton4*/
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
            toast("Uno")
        }
        btn2.onClick {
            toast("Dos")
        }
        btn3.onClick {
            toast("Tres")
        }

        btn4.onClick {
            toast("Cuatro")
        }

    }
    }
