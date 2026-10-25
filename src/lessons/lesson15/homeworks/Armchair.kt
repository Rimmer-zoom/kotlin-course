package lessons.lesson15.homeworks

class Armchair(name: String, material: String, legsCount: Int, val hasArmrests: Boolean) :
    Chair(name, material, legsCount) {
    override fun describe() {
        super.describe()
        println("Подлокотники: ${if (hasArmrests) "есть" else "нет"}")
    }
}