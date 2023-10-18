package com.Devpuntocom.project.PooHerencia

fun main(){
    val persona1 = Persona("David",17)
    persona1.imprimir()
    val empleado1= Empleado("Angel",17,6000000.0)
    empleado1.imprimir()
    empleado1.impuesto()


}