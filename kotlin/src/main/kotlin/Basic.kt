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

fun exoMatrix() {
    val matrix = arrayOf(
        intArrayOf(9, 8, 7),
        intArrayOf(5, 3, 2),
        intArrayOf(6, 6, 7)
    )
    for (row in matrix){
        for (cell in row){
            print("$cell ")
        }
        println()
    }

}

data class User(val name: String, val id:Int) {
    override fun equals(other: Any?): Boolean {
        return other is User && other.id == this.id
    }
}

fun User.getName(): String = this.name

enum class Numbers4(private val n:Int) {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);

    fun isDividedBy2() = this.n % 2 == 0
}

fun computeTotal(price: Double, quantity: Int): Double {
    var product = object {
        var x_price: Double = price
        var x_quantity: Int = quantity
    }

    return product.x_price * product.x_quantity
}

object Config {
    fun getEnv(host:String, port:String): List<String> {
        return listOf(host, port)
    }
}


class Customer {
    companion object Enterprise {
        fun getType(type:String): String {
            return if (type === "ENT") {
                "Is Enterprise"
            } else {
                "Is Not Enterprise"
            }
        }
    }
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun doSum(a: Int, b: Int): Int {
    return a + b
}

val concatenate: (String, Int) -> String = {str, int -> str + int.toString()}


fun hamingDNA(originStrand: String, resultStrand: String): Int {

    /* First implementation that is lazy but allow to use other collections methods */
//    val bases = listOf('A', 'C', 'G', 'T');
//    val goodStrand = originStrand.all { it in bases }
//    var distance: Int = 0
//    if (goodStrand) {
//        var resultingStrands = originStrand zip resultStrand
//        resultingStrands.forEach { strand -> strand.toList().distinct().count()
//            if (strand.toList().distinct().count() != 1) {
//                distance += 1
//            }
//        }
//        println("The distance is $distance")
//    } else {
//        println("This is not a right DNA strand")
//    }


    /* More improved implementation */
    require(originStrand.length == resultStrand.length) {"Strands must be equal length"}

    val originStrandUpper = originStrand.uppercase()
    val resultStrandUpper = resultStrand.uppercase()

    require(originStrandUpper.all { it in "ACGT" }) {"Strands in originStrand is not a right DNA strand"}
    require(resultStrandUpper.all { it in "ACGT" }) {"Strands in resultStrand is not a right DNA strand"}

    var distance = 0

    for (i in originStrandUpper.indices) {
        if (originStrandUpper[i] != resultStrandUpper[i]) {
            distance++
        }
    }

    println("The distance is $distance")

    return distance
}

fun scrabbleScore(word: String): Int {

    var score = 0
    for (char in word.uppercase()) {
        when( char) {
            'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> score+=1
            'D', 'G' -> score+=2
            'B', 'C', 'M', 'P' -> score+=3
            'F', 'H', 'V', 'W', 'Y' -> score+=4
            'K' -> score+=5
            'J', 'X' -> score+=8
            'Q', 'Z' -> score+=10
        }
    }
    return score

}

fun differenceOfSquare(min: Int, max: Int): Int {

    val squareOfSum = (min..max).sum().let { it * it }
    val sumOfSquare = (min..max).sumOf { it * it }

    return squareOfSum - sumOfSquare

}

