package com.Devpuntocom.project.POObasic

class PersonaConstructor constructor(nombre : String, edad : Int) {
    var nombre: String=nombre
    var edad : Int = edad

    fun imprimir (){
        println("Nombre: $nombre y edad $edad")
    }
    fun mayorEdad(){
        if (edad >= 18){
            println("Usted $nombre es mayor de edad")
        }else{
            println("Usted $nombre es menor de edad")
        }
    }

}