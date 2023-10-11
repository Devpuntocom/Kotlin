package com.Devpuntocom.project.POOColaboracion

class Cliente(var nombre:String,var saldoCuenta:Float) {
    fun consignar(valor:Float){
        this.saldoCuenta += valor
    }
    fun retirar(valor: Float){
        this.saldoCuenta -= valor
    }
    fun imprimir (){
        println("Usted $nombre tiene $saldoCuenta")
    }
}