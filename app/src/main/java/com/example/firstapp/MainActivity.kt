package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private var textoEntrada:TextView?= null
    private var finalizada:Boolean= false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.textoEntrada = findViewById(R.id.textoResultado)

        val buttonClear : Button = findViewById(R.id.buttonClear)
        val buttonPorcentaje : Button = findViewById(R.id.buttonPorcentaje)
        val buttonDivide : Button = findViewById(R.id.buttonDivide)
        val buttonMultiplica : Button = findViewById(R.id.buttonMultiplica)
        val buttonResta : Button = findViewById(R.id.buttonResta)
        val buttonSuma : Button = findViewById(R.id.buttonSuma)
        val buttonComa : Button = findViewById(R.id.buttonComa)
        val buttonIgual : Button = findViewById(R.id.buttonIgual)
        val button9 : Button = findViewById(R.id.button9)
        val button8 : Button = findViewById(R.id.button8)
        val button7 : Button = findViewById(R.id.button7)
        val button6 : Button = findViewById(R.id.button6)
        val button5 : Button = findViewById(R.id.button5)
        val button4 : Button = findViewById(R.id.button4)
        val button3 : Button = findViewById(R.id.button3)
        val button2 : Button = findViewById(R.id.button2)
        val button1 : Button = findViewById(R.id.button1)
        val button0 : Button = findViewById(R.id.button0)

        buttonClear.setOnClickListener{ clear() }
        buttonPorcentaje.setOnClickListener{ buttonPorcentaje() }
        buttonDivide.setOnClickListener{ buttonDivide() }
        buttonMultiplica.setOnClickListener{ buttonMultiplica() }
        buttonResta.setOnClickListener{ buttonResta() }
        buttonSuma.setOnClickListener{ buttonSuma() }
        buttonComa.setOnClickListener{ buttonComa() }
        buttonIgual.setOnClickListener{ buttonIgual() }
        button9.setOnClickListener{ button9() }
        button8.setOnClickListener{ button8() }
        button7.setOnClickListener{ button7() }
        button6.setOnClickListener{ button6() }
        button5.setOnClickListener{ button5() }
        button4.setOnClickListener{ button4() }
        button3.setOnClickListener{ button3() }
        button2.setOnClickListener{ button2() }
        button1.setOnClickListener{ button1() }
        button0.setOnClickListener{ button0() }
    }
    private fun clear(){
        this.textoEntrada?.setText("0")
    }

    private fun buttonPorcentaje() {
        var nuevoTexto:String = textoEntrada?.text as String
        nuevoTexto += "%"
        textoEntrada?.setText(nuevoTexto)
        finalizada = false
    }
    private fun buttonDivide() {
        var nuevoTexto:String = textoEntrada?.text as String
        nuevoTexto += "/"
        textoEntrada?.setText(nuevoTexto)
        finalizada = false
    }
    private fun buttonMultiplica() {
        var nuevoTexto:String = textoEntrada?.text as String
        nuevoTexto += "*"
        textoEntrada?.setText(nuevoTexto)
        finalizada = false
    }
    private fun buttonResta() {
        var nuevoTexto:String = textoEntrada?.text as String
        nuevoTexto += "-"
        textoEntrada?.setText(nuevoTexto)
        finalizada = false
    }
    private fun buttonSuma() {
        var nuevoTexto:String = textoEntrada?.text as String
        nuevoTexto += "+"
        textoEntrada?.setText(nuevoTexto)
        finalizada = false
    }
    private fun button9() {
       var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("9")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "9"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button8() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("8")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "8"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button7() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("7")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "7"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button6() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("6")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "6"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button5() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("5")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "5"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button4() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("4")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "4"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button3() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("3")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "3"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button2() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("2")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "2"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button1() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("1")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "1"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun button0() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("0")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "0"
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun buttonComa() {
        var nuevoTexto:String = textoEntrada?.text as String
        if (textoEntrada?.text == "0" || finalizada){
            textoEntrada?.setText("0.")
            finalizada = false
        }else if (textoEntrada?.text != "0"){
            nuevoTexto += "."
            textoEntrada?.setText(nuevoTexto)
        }
    }
    private fun buttonIgual() {
        var operacion = Expression(textoEntrada?.text as String)
        textoEntrada?.setText(operacion.calculate().toString())
        finalizada = true
    }

}