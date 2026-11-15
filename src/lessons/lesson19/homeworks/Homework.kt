package lessons.lesson19.homeworks

fun main() {
    println("--- 1. getMiddleElement ---")
    println("Для [1, 2, 3]: ${getMiddleElement(listOf(1, 2, 3))}")
    println("Для пяти строк: ${getMiddleElement(listOf("a", "b", "c", "d", "e"))}")
    println("Для четырёх элементов: ${getMiddleElement(listOf(1, 2, 3, 4))}")
    println("Для пустого списка: ${getMiddleElement(emptyList<Int>())}")

    println("--- 2. ListHolder ---")
    val holder = ListHolder<String>()
    holder.add("Котлин")
    holder.add("Java")
    val snapshot = holder.getAll()
    println("Элементы: $snapshot")
    holder.add("Scala")
    println("Старая копия после добавления: $snapshot")
    println("Новые элементы: ${holder.getAll()}")

    println("--- 3-4. PhrasesToListOfStrings ---")
    val mapper = PhrasesToListOfStrings()
    println("Слова: ${mapper.map("Котлин очень удобный язык")}")
    println("Список фраз: ${mapper.map(listOf("раз два", "три четыре пять"))}")

    println("--- 5. transposition ---")
    println(transposition(mapOf("one" to 1, "two" to 2, "three" to 3)))
    println("Повторяющиеся значения: ${transposition(mapOf(1 to "a", 2 to "a"))}")

    println("--- 7. StringValidator ---")
    val stringValidator = StringValidator()
    println("null: ${stringValidator.validate(null)}")
    println("пустая строка: ${stringValidator.validate("")}")
    println("пробелы: ${stringValidator.validate("   ")}")
    println("Котлин: ${stringValidator.validate("Котлин")}")

    println("--- 8. OddValidator ---")
    val oddValidator = OddValidator()
    println("4: ${oddValidator.validate(4)}")
    println("7: ${oddValidator.validate(7)}")
    println("0: ${oddValidator.validate(0)}")
    println("-2: ${oddValidator.validate(-2)}")

    println("--- 9. ListValidator ---")
    val intListValidator = ListValidator<Int>()
    println("[1, 2, 3]: ${intListValidator.validate(listOf(1, 2, 3))}")
    println("[1, null, 3]: ${intListValidator.validate(listOf(1, null, 3))}")
    println("[1, 0, 3]: ${intListValidator.validate(listOf(1, 0, 3))}")
    println("пустой список: ${intListValidator.validate(emptyList())}")
    val doubleListValidator = ListValidator<Double>()
    println("[1.5, 2.5]: ${doubleListValidator.validate(listOf(1.5, 2.5))}")
    println("[1.5, 0.0]: ${doubleListValidator.validate(listOf(1.5, 0.0))}")
}

