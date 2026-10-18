package lessons.lesson12.homeworks

fun valueTasks() {
    println("--- Приведение к значению ---")
    val numbers = listOf(7, 18, 25, 30, 12, 6, 45, 18, 3, 24)

    // 1. Размер больше 5
    println("1: ${numbers.size > 5}")

    // 2. Коллекция пустая
    println("2: ${numbers.isEmpty()}")

    // 3. Коллекция не пустая
    println("3: ${numbers.isNotEmpty()}")

    // 4. Элемент по индексу или запасное значение
    println("4: ${numbers.getOrElse(2) { -1 }}")
    println("4: ${numbers.getOrElse(20) { -1 }}")

    // 5. Сборка в строку
    println("5: ${numbers.joinToString(", ")}")

    // 6. Сумма
    println("6: ${numbers.sum()}")

    // 7. Среднее
    println("7: ${numbers.average()}")

    // 8. Максимум
    println("8: ${numbers.maxOrNull()}")

    // 9. Минимум
    println("9: ${numbers.minOrNull()}")

    // 10. Первое число или null
    println("10: ${numbers.firstOrNull()}")
    println("10: ${emptyList<Int>().firstOrNull()}")

    // 11. Содержит ли элемент
    println("11: ${numbers.contains(25)}")
}
//Обработка коллекций

fun processingTasks() {
    println("--- Обработка коллекций ---")
    val numbers = listOf(7, 18, 25, 30, 12, 6, 45, 18, 3, 24)
    val words = listOf("яблоко", "арбуз", "банан", "вишня", "апельсин", "груша", "ананас")
    val nullableWords = listOf("a", null, "bb", null, "ccc")

    // 12. Диапазон 18-30
    println("12: ${numbers.filter { it in 18..30 }}")

    // 13. Числа, которые не делятся на 2 и на 3 одновременно (то есть не кратны 6)
    println("13: ${numbers.filterNot { it % 2 == 0 && it % 3 == 0 }}")

    // 14. Очистка от null
    println("14: ${nullableWords.filterNotNull()}")

    // 15. Слова -> длины слов
    println("15: ${words.map { it.length }}")

    // 16. Слова -> словарь: перевёрнутое слово -> длина
    println("16: ${words.associate { it.reversed() to it.length }}")

    // 17. Алфавитный порядок
    println("17: ${words.sorted()}")

    // 18. Первые 3 элемента
    println("18: ${numbers.take(3)}")

    // 19. Печать квадратов элементов
    listOf(2, 3, 4).forEach { println("19: ${it * it}") }

    // 20. Группировка по первой букве
    println("20: ${words.groupBy { it.first() }}")

    // 21. Без дублей
    println("21: ${numbers.distinct()}")

    // 22. По убыванию
    println("22: ${numbers.sortedDescending()}")

    // 23. Последние 3 элемента
    println("23: ${numbers.takeLast(3)}")
}

//24 Характеристика числовой коллекции

fun describeCollection(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.first() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.max() < -10 -> "Отрицательная"
        numbers.min() > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

fun describeCollectionExamples() {
    println("--- Задача 24 ---")
    println(describeCollection(emptyList()))                         // Пусто
    println(describeCollection(listOf(1, 2, 3)))                     // Короткая
    println(describeCollection(listOf(0, 5, 6, 7, 8)))               // Стартовая
    println(describeCollection(listOf(5000, 6000, 1, 2, 3)))         // Массивная
    println(describeCollection(listOf(10, 10, 10, 10, 10)))          // Сбалансированная
    println(describeCollection(listOf(1000, 2000, 3000, 1000, 2000)))// Клейкая
    println(describeCollection(listOf(-20, -30, -40, -50, -60)))     // Отрицательная
    println(describeCollection(listOf(1500, 1200, 1100, 1300, 1400, 1600))) // Положительная
    println(describeCollection(listOf(3, 14, 1, 2, 5)))              // Пи***тая
    println(describeCollection(listOf(1, 2, 4, 5, 7)))               // Уникальная
}

//25. Анализ учебных оценок

fun bestSatisfactoryGrades(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}

//26. Каталог по первой букве

fun createCatalog(list: List<String>): Map<Char, List<String>> {
    return list
        .map { it.lowercase() }
        .groupBy { it.first() }
}

//Задача 27. Средняя длина слов

fun averageWordLength(list: List<String>): String {
    val average = list
        .map { it.length }
        .average()
    return "%.2f".format(average)
}

//Задача 28. Категоризация чисел

fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
}

//Задача 29. Поиск первого подходящего элемента

fun findFirstOlderThan(ages: List<Int?>, limit: Int): Int? {
    return ages
        .filterNotNull()
        .firstOrNull { it > limit }
}

fun main() {
    valueTasks()
    processingTasks()
    describeCollectionExamples()

    println("--- Задача 25 ---")
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(bestSatisfactoryGrades(grades))

    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    println("--- Задача 26 ---")
    println(createCatalog(list))

    println("--- Задача 27 ---")
    println(averageWordLength(list))

    println("--- Задача 28 ---")
    println(categorizeNumbers(listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)))

    println("--- Задача 29 ---")
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(findFirstOlderThan(ages, 18))
    println(findFirstOlderThan(ages, 100))
}