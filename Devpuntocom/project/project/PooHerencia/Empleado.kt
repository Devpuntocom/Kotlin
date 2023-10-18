package com.Devpuntocom.project.PooHerencia

class Empleado(nombre:String,edad:Int, val sueldo:Double):Persona(nombre,edad){
    override fun imprimir() {
        super.imprimir()
        println("Sueldo : $sueldo")
    }
    fun impuesto(){
        if (sueldo>5000000){
            println("debe pagar impuesto")
        }
        else{
            println("No debe pagar impuesto")
        }
    }


}