package lessons.lesson17.homeworks

import kotlin.math.pow

class PowerOperation : Operation("**") {
    override fun execute(first: Double, second: Double) = format(first.pow(second))
}