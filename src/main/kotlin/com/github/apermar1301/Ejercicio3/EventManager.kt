package com.github.apermar1301.Ejercicio3

open class EventManager {

    val eventListenerList = mutableListOf<EventListener>()

    fun registerListener(listener: EventListener) = eventListenerList.add(listener)

    open fun triggerEvent(event: String) {
        for (listener in eventListenerList) {
            listener.onEventOccurred(event)
        }
    }
}

fun main() {
    val listener = object : EventListener {
        override fun onEventOccurred(event: String) {
            println("Evento recibido: $event")
        }
    }

    val eventManager = object : EventManager() {
        override fun triggerEvent(event: String) {
            println("Procesando evento adicional: $event")
            super.triggerEvent(event)
        }
    }

    eventManager.registerListener(listener)
    eventManager.triggerEvent("Usuario conectado")
}
