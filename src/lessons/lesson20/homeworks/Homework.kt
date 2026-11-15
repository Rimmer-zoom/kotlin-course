package lessons.lesson20.homeworks

fun main() {
    println("--- 1. Первое и последнее ---")
    println(arrayOf(3, 7, 9, 12).firstAndLast())
    println(arrayOf(5).firstAndLast())
    println(emptyArray<Int>().firstAndLast())

    println("--- 2. Сортировка ---")
    val numbers = mutableListOf(5, 2, 9, 1)
    val ascending = numbers.sortInPlace(true)
    println("По возрастанию: $ascending, исходный: $numbers")
    val descending = numbers.sortInPlace(false)
    println("По убыванию: $descending, исходный: $numbers")
    println(mutableListOf("кот", "арбуз", "дом").sortInPlace(true))

    println("--- 3. Словарь по индексу ---")
    val data: Map<Int, List<String>>? = mapOf(
        1 to listOf("a", "b", "c"),
        2 to listOf("d"),
        3 to emptyList<String>()
    )
    println(data.valuesByIndex(1))
    val nothing: Map<Int, List<String>>? = null
    println(nothing.valuesByIndex(0))

    println("--- 4. within ---")
    println("10 в пределах 2 от 12: ${10.within(12, 2)}")
    println("10 в пределах 2 от 13: ${10.within(13, 2)}")
    println("5.5 в пределах 0.5 от 5.0: ${5.5.within(5.0, 0.5)}")
    println("5.5 в пределах 0.4 от 5.0: ${5.5.within(5.0, 0.4)}")
    println("100L в пределах 5 от 95: ${100L.within(95, 5)}")
    println("3.5f в пределах 0.5f от 3: ${3.5f.within(3, 0.5f)}")
    println("-4 в пределах 8 от 4: ${(-4).within(4, 8)}")
    println("Byte 1 и Short 5, отклонение 3: ${1.toByte().within(5.toShort(), 3)}")

    println("--- 5. Шифрование ---")
    val text = "Hello, Kotlin!"
    val encrypted = text.encrypt(3)
    println("Шифр: $encrypted")
    println("Расшифровано: ${encrypted.decrypt(3)}")
    println("Совпадает с исходным: ${encrypted.decrypt(3) == text}")
    val russian = "Привет"
    println("${russian.encrypt(1)} -> ${russian.encrypt(1).decrypt(1)}")

    println("--- 6. Твиттер ---")
    "котлин".twitterize(listOf("@ivan", "@anna", "@oleg"))
}