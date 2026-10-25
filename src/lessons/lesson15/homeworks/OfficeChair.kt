package lessons.lesson15.homeworks

class OfficeChair(name: String, material: String, legsCount: Int, val adjustableHeight: Boolean) :
    Chair(name, material, legsCount) {
    override fun describe() {
        super.describe()
        println("Регулировка высоты: ${if (adjustableHeight) "есть" else "нет"}")
    }
}