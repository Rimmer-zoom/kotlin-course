package lessons.lesson16.homeworks

fun main() {
    println("--- Животные ---")
    val animals: List<Animal> = listOf(Animal(), Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }

    println("--- Фигуры ---")
    val shapes: List<Shape> = listOf(Circle(2.0), Square(3.0), Triangle(3.0, 4.0, 90.0))
    for (shape in shapes) {
        println("${shape::class.simpleName}: ${shape.area()}")
    }

    println("--- Принтеры ---")
    val text = "Котлин это современный язык программирования который хорошо подходит для разработки"
    LaserPrinter().print(text)
    InkjetPrinter().print(text)

    println("--- Корзина ---")
    val cart = Cart()
    cart.addToCart(101)
    cart.addToCart(102, 3)
    cart.addToCart(mapOf(103 to 2, 101 to 4))
    cart.addToCart(listOf(102, 104, 104))
    println(cart)

    println("--- Логгер ---")
    val logger = Logger()
    logger.log("Приложение запущено")
    logger.log(LogLevel.WARNING, "Мало места на диске")
    logger.log(LogLevel.ERROR, "Не удалось подключиться к базе")
    logger.log(LogLevel.DEBUG, "Значение переменной x = 5")
    logger.log(listOf("Первое сообщение", "Второе сообщение"))
    logger.log(IllegalStateException("Что-то пошло не так"))
}