package lessons.lesson15.homeworks

open class Chair(name: String, material: String, val legsCount: Int) : Furniture(name, material) {
    override fun describe() {
        super.describe()
        println("Ножек: $legsCount")
    }
}