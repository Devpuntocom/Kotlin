package com.Devpuntocom.project.POOcomplementos

import  java.util.Random
import kotlin.math.PI

class Carta(val tipoCarta:DatosCartas, val numeroCarta: Int) {
    fun imprimir(){
        println("Carta: $tipoCarta valor $numeroCarta")
    }
    fun calculosMatematicos(){

    }

}
fun main(){
    var num =11..13
    var carta1 = Carta(DatosCartas.values().random(),num.random())
    carta1.imprimir()

    println("El valor PI es = $${Matematicas.PI}")
    println("Un valor aletorio entre 1 y 100  va  a ser : ${Matematicas.aleatorio(1,100)}")




}