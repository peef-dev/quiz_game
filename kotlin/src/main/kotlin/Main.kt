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
}
