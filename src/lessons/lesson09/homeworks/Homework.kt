package lessons.lesson09.homeworks

// ===== Массивы Array =====

// 10. Поиск элемента, содержащего подстроку
fun findBySubstring(array: Array<String>, query: String) {
    for (item in array) {
        if (item.contains(query)) {
            println("Найден элемент: $item")
            return
        }
    }
    println("Элемент с подстрокой \"$query\" не найден")
}

fun arraysTasks() {
    println("--- Массивы ---")

    // 1. Массив из 5 чисел со значениями 1..5
    val array1 = arrayOf(1, 2, 3, 4, 5)
    println("1: ${array1.joinToString()}")

    // 2. Массив строк размером 10 (пустые строки)
    val array2 = Array(10) { "" }
    println("2: размер = ${array2.size}")

    // 3. Массив Double: значение = удвоенный индекс
    val array3 = Array(5) { it * 2.0 }
    println("3: ${array3.joinToString()}")

    // 4. Массив Int: значение = индекс * 3 (заполняем в цикле)
    val array4 = Array(5) { 0 }
    for (i in array4.indices) {
        array4[i] = i * 3
    }
    println("4: ${array4.joinToString()}")

    // 5. Массив из 3 nullable строк: один null и две строки
    val array5 = arrayOf<String?>(null, "Kotlin", "Java")
    println("5: ${array5.joinToString()}")

    // 6. Копирование массива в цикле
    val source6 = arrayOf(10, 20, 30, 40)
    val copy6 = Array(source6.size) { 0 }
    for (i in source6.indices) {
        copy6[i] = source6[i]
    }
    println("6: ${copy6.joinToString()}")

    // 7. Вычитание одного массива из другого
    val first7 = arrayOf(10, 20, 30, 40)
    val second7 = arrayOf(1, 2, 3, 4)
    val result7 = Array(first7.size) { 0 }
    for (i in first7.indices) {
        result7[i] = first7[i] - second7[i]
    }
    println("7: ${result7.joinToString()}")

    // 8. Индекс элемента 5 через while (или -1)
    val array8 = arrayOf(3, 8, 5, 1)
    var index8 = 0
    var found8 = -1
    while (index8 < array8.size) {
        if (array8[index8] == 5) {
            found8 = index8
            break
        }
        index8++
    }
    println("8: $found8")

    // 9. Чётное / нечётное
    val array9 = arrayOf(1, 2, 3, 4, 5)
    for (number in array9) {
        val kind = if (number % 2 == 0) "чётное" else "нечётное"
        println("9: $number $kind")
    }

    // 10. Поиск по подстроке
    findBySubstring(arrayOf("яблоко", "банан", "апельсин"), "нан")
    findBySubstring(arrayOf("яблоко", "банан", "апельсин"), "киви")
}

// ===== Списки List =====

fun listsTasks() {
    println("--- Списки ---")

    // 1. Пустой неизменяемый список целых чисел
    val list1 = emptyList<Int>()
    println("1: $list1")

    // 2. Неизменяемый список из трёх строк
    val list2 = listOf("Hello", "World", "Kotlin")
    println("2: $list2")

    // 3. Изменяемый список 1..5
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    println("3: $list3")

    // 4. Добавление элементов 6, 7, 8
    list3.add(6)
    list3.add(7)
    list3.add(8)
    println("4: $list3")

    // 5. Удаление "World"
    val list5 = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")
    println("5: $list5")

    // 6. Вывод каждого элемента в цикле
    val list6 = listOf(10, 20, 30)
    for (item in list6) {
        println("6: $item")
    }

    // 7. Второй элемент по индексу
    val list7 = listOf("первый", "второй", "третий")
    println("7: ${list7[1]}")

    // 8. Замена элемента с индексом 2
    val list8 = mutableListOf(1, 2, 3, 4, 5)
    list8[2] = 99
    println("8: $list8")

    // 9. Объединение двух списков в цикле
    val first9 = listOf("a", "b")
    val second9 = listOf("c", "d", "e")
    val merged9 = mutableListOf<String>()
    for (item in first9) merged9.add(item)
    for (item in second9) merged9.add(item)
    println("9: $merged9")

    // 10. Минимум и максимум в цикле
    val list10 = listOf(7, 3, 15, -2, 9)
    var min10 = list10[0]
    var max10 = list10[0]
    for (item in list10) {
        if (item < min10) min10 = item
        if (item > max10) max10 = item
    }
    println("10: min = $min10, max = $max10")

    // 11. Только чётные числа
    val list11 = listOf(1, 2, 3, 4, 5, 6)
    val even11 = mutableListOf<Int>()
    for (item in list11) {
        if (item % 2 == 0) even11.add(item)
    }
    println("11: $even11")
}

// ===== Множества Set =====

// 7. Проверка наличия строки в множестве через цикл
fun containsString(set: Set<String>, target: String) {
    var found = false
    for (item in set) {
        if (item == target) {
            found = true
            break
        }
    }
    println(found)
}

fun setsTasks() {
    println("--- Множества ---")

    // 1. Пустое неизменяемое множество
    val set1 = emptySet<Int>()
    println("1: $set1")

    // 2. Неизменяемое множество из трёх чисел
    val set2 = setOf(1, 2, 3)
    println("2: $set2")

    // 3. Изменяемое множество строк
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")
    println("3: $set3")

    // 4. Добавление "Swift" и "Go"
    set3.add("Swift")
    set3.add("Go")
    println("4: $set3")

    // 5. Удаление элемента 2
    val set5 = mutableSetOf(1, 2, 3)
    set5.remove(2)
    println("5: $set5")

    // 6. Вывод каждого элемента в цикле
    val set6 = setOf(5, 10, 15)
    for (item in set6) {
        println("6: $item")
    }

    // 7. Проверка наличия строки
    containsString(setOf("Kotlin", "Java", "Scala"), "Java")
    containsString(setOf("Kotlin", "Java", "Scala"), "Python")

    // 8. Неизменяемое множество -> изменяемый список в цикле
    val set8 = setOf("one", "two", "three")
    val list8 = mutableListOf<String>()
    for (item in set8) {
        list8.add(item)
    }
    println("8: $list8")
}

fun main() {
    arraysTasks()
    listsTasks()
    setsTasks()
}