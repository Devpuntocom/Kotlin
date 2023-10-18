package com.Devpuntocom.project.POOcomplementos

fun main(){
    val Producto1 = producto(1,"Producto del melo", 452.3)
    val Producto2 = producto(2,"Producto Bueno", 1000.0)
    println(Producto1)
    println(Producto2)
    val seleccion = Producto1
    seleccion.Precio = 456.0
    println(Producto1)
    var producto3 = Producto2.copy()
    producto3.Precio = 45.3
    producto3.codigo = 3
    println(producto3)
}