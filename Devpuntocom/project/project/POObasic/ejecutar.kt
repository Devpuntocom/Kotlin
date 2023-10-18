package com.Devpuntocom.project.POObasic

import com.Devpuntocom.project.POObasic.personaParametro

fun main(){
   /* val persona1: Persona

    persona1 = Persona()
    persona1.inicializar("andres",50)
    persona1.imprimir()
    persona1.mayorEdad()

    val persona2: Persona
    persona2 = Persona()
    persona2.inicializar("HOlaaa",1)
    persona2.imprimir()
    persona2.mayorEdad()*/
    /*val persona1 = PersonaConstructor("david",17)
    persona1.imprimir()
    persona1.mayorEdad()*/
    val persona1 = personaParametro("david",17)
    persona1.imprimir()
    persona1.mayorEdad()
}