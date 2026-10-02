package lessons.lesson06.homeworks

// Задание 1: определение сезона
fun printSeason(month: Int) {
    if (month !in 1..12) {
        println("Ошибка: номер месяца должен быть от 1 до 12, получено $month")
        return
    }
    val season = when (month) {
        12, 1, 2 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        else -> "Осень"
    }
    println(season)
}

// Задание 2: возраст питомца в человеческих годах
fun printDogAgeInHumanYears(dogAge: Double) {
    if (dogAge < 0) {
        println("Ошибка: возраст не может быть отрицательным, получено $dogAge")
        return
    }
    val humanYears = if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        2 * 10.5 + (dogAge - 2) * 4
    }
    println("Возраст собаки в человеческих годах: $humanYears")
}

// Задание 3: способ перемещения по длине маршрута (км)
fun printTransport(distanceKm: Double) {
    if (distanceKm < 0) {
        println("Ошибка: длина маршрута не может быть отрицательной, получено $distanceKm")
        return
    }
    val transport = when {
        distanceKm <= 1 -> "пешком"
        distanceKm <= 5 -> "велосипед"
        else -> "автотранспорт"
    }
    println(transport)
}

// Задание 4: бонусные баллы (сумма в рублях)
fun printBonusPoints(purchaseAmount: Int) {
    if (purchaseAmount < 0) {
        println("Ошибка: сумма покупки не может быть отрицательной, получено $purchaseAmount")
        return
    }
    val pointsPerHundred = if (purchaseAmount <= 1000) 2 else 3
    val points = purchaseAmount / 100 * pointsPerHundred
    println("Бонусных баллов: $points")
}

// Задание 5: тип документа по расширению
fun printDocumentType(extension: String) {
    val ext = extension.trim().removePrefix(".").lowercase()
    if (ext.isEmpty()) {
        println("Ошибка: расширение файла не указано")
        return
    }
    val type = when (ext) {
        "txt", "doc", "docx", "pdf" -> "Текстовый документ"
        "jpg", "jpeg", "png", "gif", "bmp" -> "Изображение"
        "xls", "xlsx", "csv" -> "Таблица"
        else -> "Неизвестный тип"
    }
    println(type)
}

// Задание 6: конвертация температуры (unit - единица измерения исходного значения: 'C' или 'F')
fun convertTemperature(temperature: Double, unit: Char) {
    when (unit.uppercaseChar()) {
        'C' -> {
            if (temperature < -273.15) {
                println("Ошибка: температура ниже абсолютного нуля")
                return
            }
            print(temperature * 9 / 5 + 32)
            print("F")
            println()
        }
        'F' -> {
            if (temperature < -459.67) {
                println("Ошибка: температура ниже абсолютного нуля")
                return
            }
            print((temperature - 32) * 5 / 9)
            print("C")
            println()
        }
        else -> println("Ошибка: неизвестная единица измерения '$unit', допустимо C или F")
    }
}

// Задание 7: подбор одежды по погоде
fun printClothes(temperature: Int) {
    val recommendation = when {
        temperature < -30 || temperature > 35 -> "лучше не выходить из дома"
        temperature < 10 -> "куртка и шапка"
        temperature <= 18 -> "ветровка"
        else -> "футболка и шорты"
    }
    println(recommendation)
}

// Задание 8: категория фильмов по возрасту
fun getMovieCategory(age: Int): String? {
    if (age !in 0..120) {
        println("Ошибка: некорректный возраст $age")
        return null
    }
    return when {
        age <= 9 -> "детские"
        age <= 18 -> "подростковые"
        else -> "18+"
    }
}

fun main() {
    printSeason(1)
    printSeason(7)
    printSeason(13)

    printDogAgeInHumanYears(1.0)
    printDogAgeInHumanYears(5.0)
    printDogAgeInHumanYears(-1.0)

    printTransport(0.5)
    printTransport(3.0)
    printTransport(12.0)

    printBonusPoints(500)
    printBonusPoints(1000)
    printBonusPoints(2500)

    printDocumentType("txt")
    printDocumentType(".PNG")
    printDocumentType("xlsx")
    printDocumentType("exe")

    convertTemperature(100.0, 'C')
    convertTemperature(212.0, 'F')
    convertTemperature(10.0, 'K')

    printClothes(-40)
    printClothes(5)
    printClothes(15)
    printClothes(25)
    printClothes(40)

    println(getMovieCategory(7))
    println(getMovieCategory(15))
    println(getMovieCategory(30))
    println(getMovieCategory(-5))
}