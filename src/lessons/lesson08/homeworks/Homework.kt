package lessons.lesson08.homeworks

// 1. Преобразование строк (применяется только первая сработавшая проверка)
fun transformPhrase(phrase: String) {
    val result = when {
        phrase.contains("невозможно") ->
            phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
        phrase.startsWith("Я не уверен") ->
            "$phrase, но моя интуиция говорит об обратном"
        phrase.contains("катастрофа") ->
            phrase.replace("катастрофа", "интересное событие")
        phrase.endsWith("без проблем") ->
            phrase.replace("без проблем", "с парой интересных вызовов на пути")
        phrase.isNotBlank() && phrase.trim().split(" ").size == 1 ->
            "Иногда, ${phrase.trim()}, но не всегда"
        else -> phrase
    }
    println(result)
}

// 2. Извлечение даты и времени из строки лога
fun printDateAndTime(log: String) {
    val arrowIndex = log.indexOf("->")
    if (arrowIndex == -1) {
        println("Ошибка: в строке нет разделителя ->")
        return
    }
    val parts = log.substring(arrowIndex + 2).trim().split(" ").filter { it.isNotEmpty() }
    if (parts.size != 2) {
        println("Ошибка: после -> ожидаются дата и время через пробел")
        return
    }
    println(parts[0])
    println(parts[1])
}

// 3. Маскирование номера карты: остаются только последние 4 цифры
fun maskCardNumber(card: String) {
    val totalDigits = card.count { it.isDigit() }
    if (totalDigits < 4) {
        println("Ошибка: в номере карты меньше 4 цифр")
        return
    }
    var digitIndex = 0
    var result = ""
    for (char in card) {
        if (char.isDigit()) {
            digitIndex++
            result += if (digitIndex <= totalDigits - 4) '*' else char
        } else {
            result += char
        }
    }
    println(result)
}

// 4. Форматирование адреса электронной почты
fun formatEmail(email: String) {
    if (!email.contains("@")) {
        println("Ошибка: в адресе нет символа @")
        return
    }
    println(email.replace("@", " [at] ").replace(".", " [dot] "))
}

// 5. Извлечение имени файла из пути
fun printFileName(path: String) {
    val normalized = path.replace("\\", "/")
    if (normalized.endsWith("/") || normalized.isBlank()) {
        println("Ошибка: путь не содержит имени файла")
        return
    }
    println(normalized.substring(normalized.lastIndexOf("/") + 1))
}

// 6. Аббревиатура из фразы
fun printAbbreviation(phrase: String) {
    val words = phrase.trim().split(" ")
    var abbreviation = ""
    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0].uppercase()
        }
    }
    println(abbreviation)
}

fun main() {
    transformPhrase("Это невозможно выполнить за один день")
    transformPhrase("Я не уверен в успехе этого проекта")
    transformPhrase("Произошла катастрофа на сервере")
    transformPhrase("Этот код работает без проблем")
    transformPhrase("Удача")
    transformPhrase("Обычная фраза без изменений")

    printDateAndTime("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    maskCardNumber("4539 1488 0343 6467")
    formatEmail("username@example.com")
    printFileName("C:/Пользователи/Документы/report.txt")
    printFileName("D:/good.themes/dracula.theme")
    printAbbreviation("Котлин лучший язык программирования")
}