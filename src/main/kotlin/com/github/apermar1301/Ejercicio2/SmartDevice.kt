package com.github.apermar1301.Ejercicio2

interface SmartDevice : Device {
    val os: String
    fun connectToWiFi() = println("Connecting to WiFi")
}