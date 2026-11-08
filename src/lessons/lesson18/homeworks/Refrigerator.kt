package lessons.lesson18.homeworks

class Refrigerator : TemperatureOpenableEquipment("Холодильник", 10), LightEmitting {

    override fun open() {
        val wasOpen = isOpen
        super.open()
        if (!wasOpen && isPoweredOn) emitLight()
    }

    override fun close() {
        val wasOpen = isOpen
        super.close()
        if (wasOpen && isPoweredOn) completeLiteEmission()
    }

    override fun emitLight() {
        println("$name: подсветка внутри включена")
    }

    override fun completeLiteEmission() {
        println("$name: подсветка внутри выключена")
    }
}