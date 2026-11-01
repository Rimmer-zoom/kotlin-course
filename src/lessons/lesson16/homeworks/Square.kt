package lessons.lesson16.homeworks

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}