package lessons.lesson20.homeworks

// 1. Первый и последний элемент массива
fun Array<Int>.firstAndLast(): Pair<Int?, Int?> {
    return if (isEmpty()) null to null else first() to last()
}

// 2. Сортирует исходный список и возвращает его же в виде неизменяемого
fun <T : Comparable<T>> MutableList<T>.sortInPlace(ascending: Boolean): List<T> {
    if (ascending) {
        sort()
    } else {
        sortDescending()
    }
    return this
}

// 3. Ключи приводятся к строке, значениями становятся элементы списков по индексу
fun <K, V> Map<K, List<V>>?.valuesByIndex(index: Int): Map<String, V?>? {
    return this?.entries?.associate { (key, list) -> key.toString() to list.getOrNull(index) }
}

// 4. Отклонение числа от эталона не больше допустимого
val Double.absoluteValue: Double
    get() = if (this < 0.0) -this else this

fun Number.within(other: Number, deviation: Number): Boolean {
    val difference = toDouble() - other.toDouble()
    return difference.absoluteValue <= deviation.toDouble()
}

// 5. Сдвиг каждого символа по таблице Unicode
fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

// 6. Игра в Твиттере: буква под именем автора, авторы чередуются по кругу
fun String.twitterize(authors: List<String>) {
    if (authors.isEmpty()) {
        println("Список авторов пуст")
        return
    }
    for ((index, letter) in filterNot { it.isWhitespace() }.withIndex()) {
        println(authors[index % authors.size])
        println(letter.uppercase())
        println()
    }
}