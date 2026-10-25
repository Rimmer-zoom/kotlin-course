package lessons.lesson15.homeworks

class Quadrilateral(val a: Double, val b: Double, val c: Double, val d: Double) : Polygon("Четырёхугольник", 4) {
    fun perimeter(): Double = a + b + c + d
}