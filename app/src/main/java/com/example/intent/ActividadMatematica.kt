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

open class ActividadMatematica : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividadsecundaria)
    }





    override fun onResume() {
        super.onResume()
        a()
        }

    fun a(){
        val btn1: TextView = findViewById (R.id.num1)
        val btn2: TextView = findViewById (R.id.num2)
        val operacion:TextView=findViewById(R.id.oper)
        val restant:EditText?=findViewById(R.id.entrnum)
        val btnok: Button = findViewById(R.id.btnok)
        var resultado:Int? = 0

        var uno=(0..100).random()
        btn1.text= uno.toString()
        val dos=(0..100).random()
        btn2.text=dos.toString()
        val algo=(1..4).random()
        val list = listOf("+","-","x","/")
        val lista = list.get(algo)
        operacion.text=lista

        if(lista.equals("+")){
            resultado=uno+dos
        }
        else if(lista.equals("-")){
            if (uno>=dos){
                resultado=uno-dos
            }
            else{
                while(uno<dos){
                    uno = (0..100).random()
                }
                resultado=uno-dos
            }

        }
        else if(lista.equals("x")){
            resultado=uno*dos
        }
        else if(lista.equals("/")){
            resultado=uno/dos
        }


        btnok.onClick {

            val s = Integer.parseInt(restant!!.getText().toString())
            if(resultado?.equals(s)!!){
                toast("Resultado Correcto")
                a()
            }else{
                toast("No es correcto el resultado")
            }
        }
    }






    }

