package lessons.lesson15.homeworks

class Table(name: String, material: String, val seatsCount: Int) : Furniture(name, material) {
    override fun describe() {
        super.describe()
        println("Мест: $seatsCount")
    }
}