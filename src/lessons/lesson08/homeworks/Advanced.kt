package lessons.lesson08.homeworks

// 7. Все слова с большой буквы
fun capitalizeWords(text: String): String {
    var result = ""
    var newWord = true
    for (char in text) {
        if (char == ' ') {
            result += char
            newWord = true
        } else if (newWord) {
            result += char.uppercase()
            newWord = false
        } else {
            result += char.lowercase()
        }
    }
    return result
}

// 8. Игра в разведчика
private fun swapNeighbours(text: String): String {
    var result = ""
    for (i in text.indices step 2) {
        result += text[i + 1]
        result += text[i]
    }
    return result
}

fun encrypt(text: String) {
    val padded = if (text.length % 2 != 0) "$text " else text
    println(swapNeighbours(padded))
}

fun decrypt(text: String) {
    if (text.length % 2 != 0) {
        println("Ошибка: у шифрованного сообщения должна быть чётная длина")
        return
    }
    println(swapNeighbours(text))
}

// 9. Таблица умножения (rows - число строк, columns - число столбцов)
fun multiplicationTable(rows: Int, columns: Int) {
    if (rows < 1 || columns < 1) {
        println("Ошибка: размеры таблицы должны быть положительными")
        return
    }
    val rowHeaderWidth = rows.toString().length
    val widths = IntArray(columns + 1)
    for (j in 1..columns) {
        widths[j] = maxOf(j.toString().length, (rows * j).toString().length)
    }

    // строка заголовков столбцов
    print(" ".repeat(rowHeaderWidth))
    for (j in 1..columns) print(" " + "%${widths[j]}d".format(j))
    println()

    // строки таблицы
    for (i in 1..rows) {
        print("%${rowHeaderWidth}d".format(i))
        for (j in 1..columns) print(" " + "%${widths[j]}d".format(i * j))
        println()
    }
}

object AdvancedRunner {
    @JvmStatic
    fun main(args: Array<String>) {
        println(capitalizeWords("пРиВеТ мИр кОтЛиН"))
        encrypt("Kotlin")
        encrypt("Hello")
        decrypt("oKltni")
        multiplicationTable(40, 30)
    }
}