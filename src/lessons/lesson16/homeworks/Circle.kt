package lessons.lesson16.homeworks

import kotlin.math.PI

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}