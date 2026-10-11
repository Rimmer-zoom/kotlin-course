package lessons.lesson11.homeworks

// 1. Без аргументов, без возврата
fun doNothing(){

}

// 2. Два целых числа, сумма
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает стрку без возврата
fun acceptString(text: String){

}

// 4. Принимает список целых чисел, возвращает среднее (Double)
fun average(numbers: List<Int>): Double {
    if (numbers.isEmpty()) return 0.0
    return numbers.sum().toDouble() / numbers.size
}

// 5. Принимает nullable строку, возвращает nullable длину, доступна только в этом файле
private fun nullableLength(text: String?): Int? {
    return text?.length
}

// 6. Без аргументов, возвращает nullable вещественное число
fun nullableDouble(): Double? {
    return null
}

// 7. Принимает nullable список целых, ничего не возвращает, доступна только в этом файле
private fun acceptNullableList(numbers: List<Int>?) {

}

// 8. Принимает целое число, возвращает nullable строку
fun intToNullableString(number: Int): String? {
    return if (number >= 0) number.toString() else null
}

// 9. Без аргументов, возвращает список nullable строк
fun nullableStrings(): List<String?> {
    return listOf("Kotlin", null, "Java")
}

// 10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение
fun checkNullable(text: String?, number: Int?): Boolean? {
    if (text == null || number == null) return null
    return text.length == number
}

// Написание кода

// 11. Умножение на 2
fun multiplyByTwo(number: Int): Int = number * 2

// 12. Проверка на четность
fun isEven(number: Int): Boolean = (number % 2) == 0

// 13. Вывод чисел от 1 до n (при n < 1 просто выходим)
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

// 14. Первое отрицательное число или null
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) return number
    }
    return null
}

// 15. Вывод строк списка, при встрече null - выходим
fun processList(strings: List<String?>) {
    for (i in strings){
        if (i == null) return
        println(i)
    }
}

fun main() {
    println(sum(2, 3))
    println(average(listOf(1, 2, 3, 4)))
    println(nullableLength("Kotlin"))
    println(nullableLength(null))
    println(intToNullableString(5))
    println(intToNullableString(-5))
    println(nullableStrings())
    println(checkNullable("abc", 3))
    println(checkNullable(null, 3))

    println(multiplyByTwo(21))
    println(isEven(4))
    println(isEven(7))
    printNumbersUntil(3)
    printNumbersUntil(0)
    println(findFirstNegative(listOf(3, 5, -2, -7)))
    println(findFirstNegative(listOf(1, 2, 3)))
    processList(listOf("a", "b", null, "c"))
}