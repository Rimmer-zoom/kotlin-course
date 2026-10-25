package lessons.lesson15.homeworks

open class Figure(val name: String) {
    open fun describe() {
        println("Фигура: $name")
    }
}