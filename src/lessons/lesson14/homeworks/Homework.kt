package lessons.lesson14.homeworks

fun main() {
    Party("Дом на пляже", 20).details()
    Emotion("радость", 8).express()
    Moon.showPhase()

    val apple = Product("Яблоко", 0.5, 10)
    println("Продукт: ${apple.name}, цена: ${apple.price}, количество: ${apple.quantity}")
    println(apple) // автоматический вывод data-класса

    val concert = Concert("The Beatles", "Мэдисон-сквер-гарден", 5000, 1000)
    concert.printDetails()
    concert.buyTicket()
    concert.printDetails()

    val rack = Rack(2)
    val shelf1 = Shelf(10)
    val shelf2 = Shelf(10)
    println(rack.addShelf(shelf1))      // true
    println(rack.addShelf(shelf1))      // false (уже установлена)
    println(rack.addShelf(shelf2))      // true
    println(rack.addShelf(Shelf(5)))    // false (стеллаж заполнен)

    println(rack.addItem("стол"))       // true
    println(rack.addItem("шкаф"))       // true
    println(rack.addItem("диван"))      // true (попал на вторую полку)
    println(rack.addItem("кресло"))     // false (нигде нет места)
    rack.printContents()

    println(rack.advancedRemoveShelf(0)) // [шкаф]
    rack.printContents()
    println(rack.removeShelf(5))         // []
}