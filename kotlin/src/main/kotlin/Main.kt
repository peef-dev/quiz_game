package main.kotlin

fun main() {
    print("Hello ")
    print("World!\n")

    var values = variables()
    for (value in values.indices) {
        println("Value No $value is ${values[value]}")
    }


    val area = getRectangleArea()
    println("2. Area of the rectangle is ${area[0]}")
    println("3. Hexa decimal color is ${area[1]}")

    println(printMessage("Hello"))
    println(printMessageWithPrefix("Yoooo"))
    println(printMessageWithPrefix(message = "Greeting", prefix = "GR"))
    println(sum(4, 5))
    println(multiply(4, 5))

    infix fun Int.times(str: String) = str.repeat(this)
    println(3 times "bye ")

    infix fun String.putIn(fruits: Array<Any>) = fruits
    var result = "mango" putIn arrayOf()
    println(result)

    fun artistNames(vararg names: String) {
        for (name in names) println(name)
    }

    var names = arrayOf("Tayc", "Zoro")
    artistNames(*names)
}
