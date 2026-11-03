package com.github.apermar1301.Ejercicio2

class SmartPhone(override val os: String, override val brand: String) : SmartDevice {

    override fun turnOff() = println("Turning off the device")
    override fun connectToWiFi() = println("Connecting to internet")
}

fun main() {
    val iPhone = SmartPhone("IOS", "APPLE")
    iPhone.turnOn()
    iPhone.turnOff()
    iPhone.connectToWiFi()
}