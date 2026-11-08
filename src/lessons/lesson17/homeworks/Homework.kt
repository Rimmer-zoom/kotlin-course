package lessons.lesson17.homeworks

fun main() {
    println("--- Почемучка ---")
    val child = ChildrenClass("приватное", "защищённое", "публичное")
    println(child.privateVal)
    child.publicField = "Антонио Бандерас"
    child.changeProtectedField("Новое значение защищённого поля")
    println(child.getAll())
    child.printText()

    println("--- Калькулятор ---")
    val expressions = listOf(
        "3 + 4", "10 - 2.5", "6 * 7", "8 / 2", "7 / 0",
        "17 % 5", "2 ** 10", "3 max 9", "3 ^ 4"
    )

    println("Стандартный калькулятор:")
    val calculator = Calculator()
    for (expression in expressions) {
        println("$expression = ${calculator.calculate(expression)}")
    }

    println("Калькулятор с пользовательскими операциями (через конструктор):")
    val extended = Calculator(PowerOperation(), MaxOperation())
    for (expression in expressions) {
        println("$expression = ${extended.calculate(expression)}")
    }

    println("Добавление операции через addOperation:")
    calculator.addOperation(MaxOperation())
    println("3 max 9 = ${calculator.calculate("3 max 9")}")
    println("2 ** 10 = ${calculator.calculate("2 ** 10")}")
}