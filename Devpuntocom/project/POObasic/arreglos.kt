package com.Devpuntocom.project.POObasic

fun salario(){
    val salarios: DoubleArray
    salarios = DoubleArray(6)
    for (i in 1..5){
        println("ingrese el salario del empleado")
        salarios[i]= readln().toDouble()
    }
    val SueldoOrdenado = salarios.sortDescending()
    for (i in 1..5){
        println(salarios[i])
    }

}

fun main(){
    salario()
}