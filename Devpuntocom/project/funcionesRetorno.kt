package com.Devpuntocom.project

class funcionesRetorno {}

    fun superficie(lado: Int): Int {
        val superficie = lado * lado
        return superficie
    }
    /*funcion unica expresion*/
    fun superficieUnicaExpresion(lado:Int)=lado*lado






    fun datos() {
        println("Ingrese el valor del lado del cuadrado:")
        val ladorecogido = readln().toInt()
        val CalculoSuperficie = superficie(ladorecogido)
        println("La superficie del cuadrado es $CalculoSuperficie")
    }

    fun main() {
        datos()
    }

