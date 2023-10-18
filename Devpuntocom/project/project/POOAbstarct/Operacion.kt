package com.Devpuntocom.project.POOAbstarct

abstract class Operacion(val numero1:Int, val numero2 : Int){
    protected  var resultado : Int = 0
    abstract fun operar()
        fun imprimir(){
            println("Resultado : $resultado")
        }


    }
