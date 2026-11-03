package com.github.apermar1301.Ejercicio1

enum class OrderStatus (val description: String){
    PENDING("Order has been received"),
    PROCESSING("Order is being processed"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order has been delivered"),
    CANCELED("Order has been cancelled");

    fun printStatus() = println("$name : $description")
}

fun main() {
    OrderStatus.values().forEach {it.printStatus()}
}