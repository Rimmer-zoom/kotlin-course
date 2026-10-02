package lessons.lesson07.homeworks

//for
// 1. Числа от 1 до 5
fun forRange() {
    for (i in 1..5) {
        println(i)
    }
}

// 2. Чётные числа от 1 до 10
fun forEven() {
    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }
}

// 3. Числа от 5 до 1
fun forDown() {
    for (i in 5 downTo 1) {
        println(i)
    }
}

// 4. Числа от 10 до 1 с шагом -2
fun forDownStep() {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

// 5. Числа от 1 до 9 с шагом 2
fun forStep2() {
    for (i in 1..9 step 2) {
        println(i)
    }
}

// 6. Каждое третье число от 1 до 20
fun forStep3() {
    for (i in 1..20 step 3) {
        println(i)
    }
}

// 7. От 3 до size (не включая) с шагом 2
fun forUntil(size: Int) {
    for (i in 3 until size step 2) {
        println(i)
    }
}

//while
// 8. Квадраты чисел от 1 до 5
fun whileSquares() {
    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }
}

// 9. Уменьшаем число от 10 до 5, затем выводим результат
fun whileDecrease() {
    var number = 10
    while (number > 5) {
        number--
    }
    println(number)
}

// 10. do while: числа от 5 до 1
fun doWhileDown() {
    var i = 5
    do {
        println(i)
        i--
    } while (i >= 1)
}

// 11. do while: счётчик с 5, пока меньше 10
fun doWhileCounter() {
    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)
}

//break
// 12. for от 1 до 10, выход при достижении 6
fun forBreak() {
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
}

// 13. Бесконечный while, выход при достижении 10
fun whileBreak() {
    var i = 1
    while (true) {
        if (i == 10) break
        println(i)
        i++
    }
}

//continue
// 14. for от 1 до 10, пропускаем чётные
fun forContinue() {
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
}

// 15. while от 1 до 10, пропускаем кратные 3
fun whileContinue() {
    var i = 0
    while (i < 10) {
        i++
        if (i % 3 == 0) continue
        println(i)
    }
}

// ===== Повышенная сложность =====

// 1. Таблица умножения
fun multiplicationTable() {
    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            if (j < 10) print(" ")
        }
        println()
    }
}

// 2. Сумма чисел от 1 до arg (for)
fun sumToArg(arg: Int): Int {
    if (arg < 1) {
        println("Ошибка: аргумент должен быть не меньше 1")
        return 0
    }
    var sum = 0
    for (i in 1..arg) sum += i
    return sum
}

// 3. Факториал (while)
fun factorial(arg: Int): Long {
    if (arg < 0 || arg > 20) {
        println("Ошибка: аргумент должен быть от 0 до 20")
        return -1
    }
    var result = 1L
    var i = 2
    while (i <= arg) {
        result *= i
        i++
    }
    return result
}

// 4. Сумма чётных чисел от 2 до arg (while)
fun sumEvenToArg(arg: Int): Int {
    var sum = 0
    var i = 2
    while (i <= arg) {
        sum += i
        i += 2
    }
    return sum
}

// 5. Прямоугольник 5x3 из символов * (вложенные while)
fun printRectangle() {
    var row = 0
    while (row < 3) {
        var column = 0
        while (column < 5) {
            print("*")
            column++
        }
        println()
        row++
    }
}

// 6. Суммы чётных и нечётных чисел от 1 до arg (for)
fun sumEvenAndOdd(arg: Int) {
    var evenSum = 0
    var oddSum = 0
    for (i in 1..arg) {
        if (i % 2 == 0) evenSum += i else oddSum += i
    }
    println("Сумма чётных: $evenSum, сумма нечётных: $oddSum")
}

fun main() {
    forRange()
    forEven()
    forDown()
    forDownStep()
    forStep2()
    forStep3()
    forUntil(12)
    whileSquares()
    whileDecrease()
    doWhileDown()
    doWhileCounter()
    forBreak()
    whileBreak()
    forContinue()
    whileContinue()

    multiplicationTable()
    println(sumToArg(10))
    println(factorial(5))
    println(sumEvenToArg(10))
    printRectangle()
    sumEvenAndOdd(10)
}