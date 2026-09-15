package com.example.gamezone
open class consola(val codigo: String, val marca: String, val modelo: String, val usuario: String) {
    open fun descripcion(): String {
        return "codigo: $codigo || marca: $marca || modelo: $modelo || usuario: $usuario"
    }

}
class consolaClasica(codigo: String, marca: String, modelo: String, usuario: String, val valor: Int = 800): consola(codigo, marca, modelo, usuario){

    override fun descripcion(): String {
        return super.descripcion() + "|| valor: $valor"
    }

    fun checkCode(): String {
        if (codigo.startsWith("CC") == false || codigo.length != 6) {
            return "$codigo formato invalido"
        }
        return "$codigo formato valido"
    }
}

class consolaModerna(codigo: String, marca: String, modelo: String, usuario: String, val valor: Int = 1500): consola(codigo, marca, modelo, usuario){
    override fun descripcion(): String {
        return super.descripcion() + "|| valor: $valor"
    }

    fun checkCode(): String {
        if (codigo.startsWith("CM" ) == false || codigo.length != 6) {
            return "$codigo formato invalido"
        }
        return "$codigo formato valido"
    }
}

class consolaVR(codigo: String, marca: String, modelo: String, usuario: String, val valor: Int = 3000, val premium: Boolean): consola(codigo, marca, modelo, usuario){
    override fun descripcion(): String {
        return super.descripcion() + "|| valor: $valor || accesorio premium: $premium"
    }

    fun checkCode(): String {
        if (codigo.startsWith("VR") == false || codigo.length != 6) {
            return "$codigo formato invalido"
        }
        return "$codigo formato valido"
    }
}

class puesto(val estado: String){

}

fun main(){
    val consola1 = consolaClasica("CC12CD", "Sony", "Playstation 5", "socio")
    val consola2 = consolaClasica("CC99ZA", "Microsoft", "Xbox Series X", "infanil")
    val consola3 = consolaModerna("CM22TO", "Nintendo", "Switch", "infantil")
    val consola4 = consolaVR("VR44RG", "Meta", "Quest 3", "educacional", 3000,true )
    val consola5 = consolaVR("VR44RG", "HTC", "Vive Pro", "infantil", 3000, true )


    val consola6 = consolaClasica("CC12CD", "Sony", "Playstation 5", "socio")
    val consola7 = consolaModerna("CC12CD", "Sony", "Playstation 5", "socio")
    val consola8 = consolaVR("VR44RGAA", "Meta", "Quest 3", "educacional", 3000, true )

    println(consola1.descripcion())
    println(consola2.descripcion())
    println(consola3.descripcion())
    println(consola4.descripcion())
    println(consola5.descripcion())

    println(consola6.checkCode())
    println(consola7.checkCode())
    println(consola8.checkCode())
}