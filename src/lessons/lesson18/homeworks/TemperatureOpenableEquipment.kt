package lessons.lesson18.homeworks

abstract class TemperatureOpenableEquipment(
    name: String,
    override val maxTemperature: Int
) : ProgrammableEquipment(name), Openable, TemperatureRegulatable {

    var isOpen: Boolean = false
        private set

    var targetTemperature: Int? = null
        private set

    override fun setTemperature(temp: Int) {
        if (!checkPower("установить температуру $temp°C")) return
        if (temp > maxTemperature) {
            println("$name: температура $temp°C превышает максимум $maxTemperature°C")
            return
        }
        targetTemperature = temp
        println("$name: установлена температура $temp°C")
    }

    override fun open() {
        if (isOpen) {
            println("$name: уже открыто")
            return
        }
        isOpen = true
        println("$name: открывается")
    }

    override fun close() {
        if (!isOpen) {
            println("$name: уже закрыто")
            return
        }
        isOpen = false
        println("$name: закрывается")
    }
}