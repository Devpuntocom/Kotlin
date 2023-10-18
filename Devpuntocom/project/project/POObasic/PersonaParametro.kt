package com.Devpuntocom.project.POObasic

class personaParametro(var nombre : String, var edad : Int) {
    fun imprimir() {
        println("Nombre: $nombre y edad $edad")
    }

    fun mayorEdad() {
        if (edad >= 18) {
            println("Usted $nombre es mayor de edad")
        } else {
            println("Usted $nombre es menor de edad")
        }
    }
}
