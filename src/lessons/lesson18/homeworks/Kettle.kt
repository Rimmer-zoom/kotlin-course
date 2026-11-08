package lessons.lesson18.homeworks

class Kettle : TemperatureOpenableEquipment("Чайник", 100), WaterContainer, AutomaticShutdown {

    override val capacity = 1700
    override val sensorType = "датчик температуры"
    override val maxSensoredValue = 100

    private var waterLevel = 0

    override fun fillWater(amount: Int) {
        if (!isOpen) {
            println("$name: сначала откройте крышку")
            return
        }
        if (waterLevel + amount > capacity) {
            waterLevel = capacity
            println("$name: налито до максимума, $capacity мл")
        } else {
            waterLevel += amount
            println("$name: налито $amount мл, всего $waterLevel мл")
        }
    }

    override fun getWater(amount: Int) {
        if (amount > waterLevel) {
            println("$name: в чайнике только $waterLevel мл")
            return
        }
        waterLevel -= amount
        println("$name: вылито $amount мл, осталось $waterLevel мл")
    }

    override fun startMonitoring() {
        println("$name: $sensorType работает (предел $maxSensoredValue°C)")
    }

    override fun execute() {
        if (!checkPower("вскипятить")) return
        if (isOpen) {
            println("$name: сначала закройте крышку")
            return
        }
        if (waterLevel == 0) {
            println("$name: нет воды")
            return
        }
        startMonitoring()
        println("$name: вода нагрета до ${targetTemperature ?: maxTemperature}°C")
        powerOff()
    }
}