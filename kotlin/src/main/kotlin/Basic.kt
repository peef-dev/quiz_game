package main.kotlin

import main.kotlin.anime.Anime
import main.kotlin.rectangle.Rectangle
import main.kotlin.vehicle.ElectricVehicle
import main.kotlin.vehicle.Vehicle
import main.kotlin.vehicle.Bike
import main.kotlin.anime.Mangas

fun variables(): List<Any> {
    var a = 0
    val b = "One"
    a += 1
    return listOf(a, b)
}

fun getRectangleArea(): List<Any> {
    val width = 34
    val height = 50
    val rectangle = Rectangle(width.toDouble(), height.toDouble())
    return listOf(rectangle.area(), showColor(rectangle, "white"))
}

fun showColor(rectangle: Rectangle, color: String): String {
    return rectangle.defineColorHex(color)
}


fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String="Hello") {
    println("[$prefix] $message")
}

fun sum(x: Int, y:Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x*y

fun getNullOrNot(maybeNull: Int?) {
    if (maybeNull != null) {
        println(maybeNull)
    } else {
        println("maybeNull argument is null")
    }
}

class Books<B>(vararg names: B) {

    private val books = names.toMutableList()
    fun listBooks(): MutableList<B> {
        return books
    }
}

class BMW: Vehicle() {
    override fun start() {
        println("start BMV")
    }

    override fun stop() {
        println("stop BMV")
    }

}

class Tesla : ElectricVehicle("Tesla")
val vehicle: ElectricVehicle = Tesla()

class BikeX3(name: String) : Bike(name=name, origin="Germany")
val bike: Bike = BikeX3("x3")


fun mangas() {
    val animates =  Mangas(listOf(Anime("Blue Lock"), Anime("Blue Seed")))
    for (anime in animates) {
        println(anime.name)
    }
}
