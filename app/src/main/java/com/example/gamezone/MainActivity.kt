package com.example.gamezone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

open class consola(val codigo: String, val marca: String, val modelo: String, val usuario: String) {
    open fun descripcion(): String {
        return "codigo: $codigo || marca: $marca || modelo: $modelo || usuario: $usuario"
    }

    //open fun checkCode(): String {
    //    if (codigo. == false) {
    //        return "$codigo formato invalido"
    //    }
    //    return "$codigo"
    //}
}
class consolaClasica(codigo: String, marca: String, modelo: String, usuario: String, val valor: Int = 800): consola(codigo, marca, modelo, usuario){

    override fun descripcion(): String {
        return super.descripcion() + "|| valor: $valor"
    }
}

class consolaModerna(codigo: String, marca: String, modelo: String, usuario: String, val valor: Int = 1500): consola(codigo, marca, modelo, usuario){
    override fun descripcion(): String {
        return super.descripcion() + "|| valor: $valor"
    }
}

class consolaVR(codigo: String, marca: String, modelo: String, usuario: String, val valor: Int = 3000, val premium: Boolean): consola(codigo, marca, modelo, usuario){
    override fun descripcion(): String {
        return super.descripcion() + "|| valor: $valor || accesorio premium: $premium"
    }
}

class puesto(val estado: String){

}

fun main(){
    val consola1 = consolaClasica("CC12CD", "Sony", "Playstation 5", "socio")
    val consola2 = consolaClasica("CC99ZA", "Microsoft", "Xbox Series X", "infanil")
    val consola3 = consolaModerna("CM22TO", "Nintendo", "Switch", "infantil")
    var consola4 = consolaVR("VR44RG", "Meta", "Quest 3", "educacional", 3000, premium = true )
    var consola5 = consolaVR("VR44RG", "HTC", "Vive Pro", "infantil", 3000, premium = true )
    val consola6 = consolaClasica("12CCCD", "Sony", "Playstation 5", "socio")

    println(consola1.descripcion())
    println(consola4.descripcion())
    println(consola5.descripcion())
    // println(consola6.checkCode())
}