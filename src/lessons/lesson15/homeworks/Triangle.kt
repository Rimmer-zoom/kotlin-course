package lessons.lesson15.homeworks

class Triangle(val a: Double, val b: Double, val c: Double) : Polygon("Треугольник", 3) {
    fun perimeter(): Double = a + b + c
}