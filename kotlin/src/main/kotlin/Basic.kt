package main.kotlin

import main.kotlin.rectangle.Rectangle

fun variables(): List<Any> {
    var a = 0
    val b = "One"
    a += 1
    return listOf(a, b)
}

fun getRectangleArea(): List<Any> {
    val width = 34
    val height = 50
    var rectangle = Rectangle(width.toDouble(), height.toDouble())
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



