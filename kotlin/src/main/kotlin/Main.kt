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

    infix fun String.putIn(fruits: Array<String>) = fruits + this
    var fruits = arrayOf("banana")
    fruits = "mango" putIn fruits
    println(fruits.contentToString())

    fun artistNames(vararg names: String) {
        for (name in names) println(name)
    }

    var names = arrayOf("Tayc", "Zoro")

    var nullValue: Int? = 8 // means the nullValue can be null
    nullValue = null
    println(nullValue)

    var canNotBeNull: Float = 7.9F
    // canNotBeNull = null

    getNullOrNot(null)
    getNullOrNot(85)

    var bookStore = Books("Design patterns", "SEO Mastery")
    var books = bookStore.listBooks()
    println(books)

    BMW().start()
    BMW().stop()

    vehicle.vehicleName()

    bike.bikeName()

    mangas()

    exoMatrix()

    var user1 = User("Bob", 1)
    var user2 = User("John", 1)
    var user3 = User("Doe", 2)

    println(user1 == user2)
    println(user1 == user3)

    println(Numbers4.ONE.isDividedBy2())
    println(Numbers4.TWO.isDividedBy2())

    println(computeTotal(2.8, 5))

    println(Config.getEnv("localhost", "2000"))

    println(Customer.getType("YO"))

    println(calculate(1, 2, ::doSum))

    println(calculate(2, 3) {a, b -> a*b})

    println(concatenate("hello ", 3))

    hamingDNA("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT")

    println("Scrable score of Pinaple is ${scrabbleScore("Pinaple")}")

    println("Difference of square ${differenceOfSquare(1, 10)}")

    val empty = "test".let {
        println(it.isEmpty())
    }

    val againEmpty = "test".run {
        println(this.isEmpty())
        println(this.length)
    }

    data class Configuration(
        var port: String = "123",
        var host: String = "localhost"
    )
    val config = Configuration()

    with(config) {
        println("$host:$port")
    }

    val newConf = Configuration()

    val url = newConf.apply {
        host = "Jake";
        port = "yoo"
    }.toString()
    println(url)

}
