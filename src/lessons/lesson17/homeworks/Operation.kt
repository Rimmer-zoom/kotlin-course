package lessons.lesson17.homeworks

import kotlin.math.abs

abstract class Operation(private val symbol: String) {

    fun isApplicable(expression: String): Boolean {
        val parts = splitExpression(expression)
        return parts.size == 3 &&
                parts[1] == symbol &&
                parts[0].toDoubleOrNull() != null &&
                parts[2].toDoubleOrNull() != null
    }

    fun calculate(expression: String): String {
        val (first, second) = splitOperands(expression)
        return execute(first, second)
    }

    protected abstract fun execute(first: Double, second: Double): String

    protected fun splitOperands(expression: String): Pair<Double, Double> {
        val parts = splitExpression(expression)
        return Pair(parts[0].toDouble(), parts[2].toDouble())
    }

    // 7.0 печатаем как 7, а 7.5 оставляем как есть
    protected fun format(value: Double): String {
        return if (value % 1.0 == 0.0 && abs(value) < 1e15) value.toLong().toString() else value.toString()
    }

    private fun splitExpression(expression: String): List<String> {
        return expression.trim().split(" ").filter { it.isNotEmpty() }
    }
}