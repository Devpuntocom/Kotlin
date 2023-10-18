package com.Devpuntocom.project.POObasic

class Persona {

    var nombre: String=""
    var edad : Int = 0

    fun inicializar(nombre:String,edad:Int){
        this.nombre = nombre
        this.edad = edad
    }
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