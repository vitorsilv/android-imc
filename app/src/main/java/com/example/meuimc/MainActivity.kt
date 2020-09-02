package com.example.meuimc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularIMC(v:View){
        val nomeUsuario = et_nome.text.toString()
        val alturaUsuario = et_altura.text.toString().toDouble()
        val pesoUsuario = et_peso.text.toString().toDouble()

        val imc = pesoUsuario / (alturaUsuario * alturaUsuario)

        if(imc<18.5){
            tv_resposta.text = "$nomeUsuario, você está MAGRO. Seu IMC é $imc"
            tv_resposta.setTextColor(Color.GRAY)
        }else if(imc<=24.9){
            tv_resposta.text = "$nomeUsuario, você está NORMAL. Seu IMC é $imc"
            tv_resposta.setTextColor(Color.GREEN)
        }else{
            tv_resposta.text = "$nomeUsuario, você está com SOBREPESO. Seu IMC é $imc"
            tv_resposta.setTextColor(Color.RED)
        }
    }
}