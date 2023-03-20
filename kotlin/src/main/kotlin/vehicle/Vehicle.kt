package main.kotlin.vehicle

open class Vehicle {

    open fun start() {}
    open fun stop() {}

}

open class ElectricVehicle(private val brand: String) {
    fun vehicleName() {
        println(">> $brand")
    }
}

open class Bike(val name: String, val origin: String) {
    fun bikeName() {
        println("$name -> $origin")
    }
}
