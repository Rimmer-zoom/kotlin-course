package lessons.lesson21.homeworks

// Задача 1
fun analyzeDataType(arg: Any) {
    val result = when (arg) {
        is String -> "Это строка: $arg"
        is Number -> "Это число: $arg"
        is List<*> -> "Это список, количество элементов: ${arg.size}"
        is Map<*, *> -> "Это словарь, количество пар: ${arg.size}"
        else -> "Неизвестный тип данных"
    }
    println(result)
}

// Задача 2
fun safeCastToList(arg: Any): Int {
    return (arg as? List<*>)?.size ?: -1
}

// Задача 3
fun getStringLengthOrZero(arg: Any?): Int {
    return (arg as? String)?.length ?: 0
}

// Задача 4
fun Any.toSquare(): Double {
    val number = (this as? Number)?.toDouble()
        ?: (this as String).toDouble()
    return number * number
}

// Задача 5
fun sumIntOrDoubleValues(list: List<Any>): Double {
    return list.sumOf { (it as? Int)?.toDouble() ?: (it as? Double) ?: 0.0 }
}

// Задача 6
fun tryCastToListAndPrint(arg: Any) {
    val list = arg as? List<*>
    if (list == null) {
        println("Ошибка: не удалось привести аргумент к списку")
        return
    }
    for (item in list) {
        if (item is String) {
            println(item)
        } else {
            println("Предупреждение: элемент не является строкой ($item)")
        }
    }
}

// main для проверки
fun main() {
    println("=== Задача 1 ===")
    analyzeDataType("Привет")
    analyzeDataType(42)
    analyzeDataType(3.14)
    analyzeDataType(listOf(1, 2, 3))
    analyzeDataType(mapOf("a" to 1, "b" to 2))
    analyzeDataType(true)

    println("=== Задача 2 ===")
    println(safeCastToList(listOf(1, 2, 3, 4))) // 4
    println(safeCastToList("не список"))         // -1

    println("=== Задача 3 ===")
    println(getStringLengthOrZero("Kotlin")) // 6
    println(getStringLengthOrZero(123))      // 0
    println(getStringLengthOrZero(null))     // 0

    println("=== Задача 4 ===")
    println(4.toSquare())       // 16.0
    println(4.2.toSquare())     // 17.64
    println("4.2".toSquare())   // 17.64

    println("=== Задача 5 ===")
    println(sumIntOrDoubleValues(listOf(1, 2.5, "текст", 3, true))) // 6.5

    println("=== Задача 6 ===")
    tryCastToListAndPrint(listOf("a", "b", 42, "c"))
    tryCastToListAndPrint("не список")
}