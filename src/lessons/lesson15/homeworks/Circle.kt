package lessons.lesson15.homeworks

import kotlin.math.PI

class Circle(val radius: Double) : Figure("Круг") {
    fun area(): Double = PI * radius * radius

    override fun describe() {
        println("Круг, радиус: $radius, площадь: ${area()}")
    }
}