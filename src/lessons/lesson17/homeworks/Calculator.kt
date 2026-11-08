package lessons.lesson17.homeworks

class Calculator(vararg extraOperations: Operation) {
    private val operations = mutableListOf<Operation>(
        Addition(),
        Subtraction(),
        Multiplication(),
        Division(),
        Remainder()
    )

    init {
        operations.addAll(extraOperations)
    }

    fun addOperation(operation: Operation) {
        operations.add(operation)
    }

    fun calculate(expression: String): String {
        val operation = operations.firstOrNull { it.isApplicable(expression) }
            ?: return "Ошибка: операция не поддерживается"
        return operation.calculate(expression)
    }

    private class Addition : Operation("+") {
        override fun execute(first: Double, second: Double) = format(first + second)
    }

    private class Subtraction : Operation("-") {
        override fun execute(first: Double, second: Double) = format(first - second)
    }

    private class Multiplication : Operation("*") {
        override fun execute(first: Double, second: Double) = format(first * second)
    }

    private class Division : Operation("/") {
        override fun execute(first: Double, second: Double): String {
            return if (second == 0.0) "Ошибка: деление на ноль" else format(first / second)
        }
    }

    private class Remainder : Operation("%") {
        override fun execute(first: Double, second: Double): String {
            return if (second == 0.0) "Ошибка: деление на ноль" else format(first % second)
        }
    }
}