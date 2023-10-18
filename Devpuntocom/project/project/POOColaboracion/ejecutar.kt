package com.Devpuntocom.project.POOColaboracion

fun main(){
    /*var clientes = mutableListOf<String>()

    println("ingrese el numero de clientes")
    var nCli = readln().toInt()

    for (i in clientes){
        println("ingrese el nombre del cliente")
        var nombre = readln().toString()
        println("Ingrese el saldo del cliente")
        var saldo = readln().toDouble()
        println("Ingrese el numero de documento del cliente")
        var Doc = readln().toInt()
    }*/


    val BancoBBVA = Banco()
    BancoBBVA.movimientos()
    BancoBBVA.estadoCuenta()
    BancoBBVA.mostrarcli()






}