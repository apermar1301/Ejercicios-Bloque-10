package com.github.apermar1301.Ejercicio2

interface Device {
    val brand: String

    fun turnOn() = println("Turning on the device")
    fun turnOff()
}