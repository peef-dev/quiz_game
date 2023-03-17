package rectangle

class Rectangle(width: Double, height: Double) {

    private var width: Double = width
    private var height = height

    fun area(): Double {
        return width * height
    }

    fun defineColorHex(color: String): String =
        when (color) {
            "white" -> "#FFFFFF"
            "black" -> "#000000"
            else -> "Color not supported"
        }


}