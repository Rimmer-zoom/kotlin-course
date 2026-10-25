package lessons.lesson15.homeworks

open class Polygon(name: String, val sides: Int) : Figure(name) {
    override fun describe() {
        println("Многоугольник «$name», сторон: $sides")
    }
}