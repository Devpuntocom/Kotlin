package com.Devpuntocom.project.PooHerencia

open class Persona(val nombre:String, val edad:Int) {
    open fun imprimir(){
        println("Nombre: $nombre")
        println("Edad: $edad")
    }


}
