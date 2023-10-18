package com.Devpuntocom.project.POOColaboracion

class Banco {
    val cliente1: Cliente = Cliente("Luisa",0f)
    val cliente2: Cliente = Cliente("luis",0f)
    val cliente3 : Cliente= Cliente("David",0f)
    val cliente4: Cliente = Cliente("",0f)
    val cliente5 :Cliente = Cliente("",0f)

    fun movimientos(){
        cliente1.consignar(100000f)
        cliente2.consignar(200000f)
        cliente3.consignar(300000f)
        cliente3.retirar(10000f)

    }
    fun estadoCuenta(){
        val total = cliente1.saldoCuenta+cliente2.saldoCuenta+cliente3.saldoCuenta
        println("El saldo total en el banco es $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()

    }
    fun mostrarcli(){
        val i = 1
        var como = "cliente$i"
        println(como)
        var como1=como
        println(como1)

    }
}
