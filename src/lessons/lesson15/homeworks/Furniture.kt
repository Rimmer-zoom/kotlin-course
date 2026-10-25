package lessons.lesson15.homeworks

open class Furniture(val name: String, val material: String) {
    open fun describe() {
        println("Мебель: $name, материал: $material")
    }
}