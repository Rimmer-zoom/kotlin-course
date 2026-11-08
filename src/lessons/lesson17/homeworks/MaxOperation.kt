package lessons.lesson17.homeworks

class MaxOperation : Operation("max") {
    override fun execute(first: Double, second: Double) = format(maxOf(first, second))
}