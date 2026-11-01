package lessons.lesson16.homeworks

import kotlin.math.PI
import kotlin.math.sin

class Triangle(private val sideA: Double, private val sideB: Double, private val angleDegrees: Double) : Shape() {
    override fun area(): Double = 0.5 * sideA * sideB * sin(angleDegrees * PI / 180)
}