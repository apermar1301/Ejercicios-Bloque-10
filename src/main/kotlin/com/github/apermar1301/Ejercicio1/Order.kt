package com.github.apermar1301.Ejercicio1

class Order(
    val id: Long,
    var status: OrderStatus,
) {
    init {
        require(id >= 0) { "id must be greater than or equal to 0" }
    }
}

fun main() {
    val order = Order(0, OrderStatus.PENDING)
    println("Initial status: ${order.status}")
    order.status = OrderStatus.DELIVERED
    println("Changed status: ${order.status}")
}