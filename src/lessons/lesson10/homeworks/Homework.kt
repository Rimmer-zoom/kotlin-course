package lessons.lesson10.homeworks

fun mapTasks(){

    // 1. Пустой неизменяемый словарь Int -> Int
    val map1 = emptyMap<Int, Int>()
    println("1: $map1")

    // 2. Словарь Float -> Double
    val map2 = mapOf(1.5f to 2.25, 2.5f to 3.75, 3.5f to 4.125)
    println("2: $map2")

    // 3. Изменяемый словарь Int -> String
    val map3 = mutableMapOf<Int, String>()
    println("3: $map3")

    // 4. Добавление пар "ключ-значение"
    map3[1] = "один"
    map3[2] = "два"
    map3.put(3, "три")
    println("4: $map3")

    // 5. Получение значения по ключу (в том числе отсутствующему)
    val existing = map3[2]
    val missing = map3[99]
    println("5: ключ 2 -> $existing")
    println("5: ключ 99 -> $missing")
    println("5: ключ 99 с запасным значением -> ${map3[99] ?: "нет такого ключа"}")

    // 6. Удаление элемента по ключу
    map3.remove(2)
    println("6: $map3")

    // 7. Деление ключа на значение, деление на 0 -> "бесконечность"
    val map7 = mapOf(10.0 to 2, 7.5 to 0, 9.0 to 3, 1.0 to 0)
    for ((key, value) in map7) {
        if (value == 0) {
            println("7: $key / $value = бесконечность")
        } else {
            println("7: $key / $value = ${key / value}")
        }
    }

    // 8. Изменение значения существующего ключа
    map3[1] = "ОДИН"
    println("8: $map3")

    // 9. Объединение двух словарей через циклы
    val first9 = mapOf(1 to "a", 2 to "b")
    val second9 = mapOf(3 to "c", 4 to "d")
    val merged9 = mutableMapOf<Int, String>()
    for ((key, value) in first9) merged9[key] = value
    for ((key, value) in second9) merged9[key] = value
    println("9: $merged9")

    // 10. Словарь: String -> список Int
    val map10 = mutableMapOf<String, List<Int>>()
    map10["чётные"] = listOf(2, 4, 6)
    map10["нечётные"] = listOf(1, 3, 5)
    map10["степени двойки"] = listOf(1, 2, 4, 8)
    println("10: $map10")

    // 11. Словарь: Int -> изменяемое множество строк
    val map11 = mutableMapOf<Int, MutableSet<String>>()
    map11[1] = mutableSetOf("Kotlin", "Java")
    map11[2] = mutableSetOf("Swift")
    val set11 = map11[1]
    set11?.add("Scala")
    println("11: $set11")

    // 12. Ключи - пары чисел; ищем значение, где в паре есть число 5
    val map12 = mapOf(
        Pair(1, 2) to "первая",
        Pair(5, 3) to "вторая",
        Pair(4, 5) to "третья",
        Pair(7, 8) to "четвёртая"
    )
    for ((pair, value) in map12) {
        if (pair.first == 5 || pair.second == 5) {
            println("12: пара $pair -> $value")
        }
    }
}

// Подбор оптимального типа для словаря

fun optimalTypesTasks() {
    println("--- Подбор типа ---")

    // 1. Библиотека: автор -> список книг
    val library: Map<String, List<String>> = mapOf(
        "Толстой" to listOf("Война и мир", "Анна Каренина"),
        "Пушкин" to listOf("Евгений Онегин", "Капитанская дочка")
    )
    println("1: $library")

    // 2. Справочник растений: тип растений -> список названий
    val plants: Map<String, List<String>> = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан"),
        "Деревья" to listOf("Дуб", "Берёза")
    )
    println("2: $plants")

    // 3. Четвертьфинал: команда -> список игроков
    val teams: Map<String, List<String>> = mapOf(
        "Спартак" to listOf("Иванов", "Петров"),
        "Зенит" to listOf("Сидоров", "Кузнецов")
    )
    println("3: $teams")

    // 4. Курс лечения: дата -> список препаратов
    val treatment: Map<String, List<String>> = mapOf(
        "2026-10-06" to listOf("Аспирин", "Витамин C"),
        "2026-10-07" to listOf("Витамин C")
    )
    println("4: $treatment")

    // 5. Словарь путешественника: страна -> (город -> список интересных мест)
    val traveler: Map<String, Map<String, List<String>>> = mapOf(
        "Россия" to mapOf(
            "Москва" to listOf("Красная площадь", "Третьяковская галерея"),
            "Санкт-Петербург" to listOf("Эрмитаж", "Петергоф")
        ),
        "Франция" to mapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр")
        )
    )
    println("5: $traveler")
}

fun main() {
    mapTasks()
    optimalTypesTasks()
}