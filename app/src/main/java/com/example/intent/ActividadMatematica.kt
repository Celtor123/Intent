package com.example.intent

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.actividadsecundaria.view.*
import org.jetbrains.anko.db.INTEGER
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast
import org.w3c.dom.Text
import java.text.DecimalFormat

open class ActividadMatematica : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividadsecundaria)
    }





    override fun onResume() {
        super.onResume()
        toast("2 decimales")
        a()
        }

    fun a(){
        val btn1: TextView = findViewById (R.id.num1)
        val btn2: TextView = findViewById (R.id.num2)
        val operacion:TextView=findViewById(R.id.oper)
        val restant:EditText?=findViewById(R.id.entrnum)
        val btnok: Button = findViewById(R.id.btnok)
        var resultado:Double? = 0.0

        var uno=(0..100).random()
        btn1.text= uno.toString()
        val dos=(0..100).random()
        btn2.text=dos.toString()
        val algo=(0..0).random()
        val list = listOf("+","-","x","/")
        val lista = list.get(algo)
        operacion.text=lista

        if(lista.equals("+")){
            resultado=(uno+dos).toDouble()
        }
        else if(lista.equals("-")){
            while(uno<dos){
                uno=(dos..100).random()
                btn1.text=uno.toString()
            }
            resultado=(uno-dos).toDouble()
        }
        else if(lista.equals("x")){
            resultado=uno*dos.toDouble()
        }
        else if(lista.equals("/")){
            while(uno<dos){
                uno=(dos..100).random()
                btn1.text=uno.toString()
            }

            resultado="%.2f".format(uno.toDouble()/dos.toDouble()).toDouble()
        }


        btnok.onClick {


            val s = restant!!.getText().toString().toDouble()
            if(resultado?.equals(s)!!){
                toast("Resultado Correcto")
                a()

            }else{
                toast("No es correcto el resultado"+resultado)
            }
        }
    }






    }

