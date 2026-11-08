package lessons.lesson18.homeworks

class WashingMachine : TemperatureOpenableEquipment("Стиральная машина", 90),
    WaterConnection, Drainable, Timable, AutomaticShutdown {

    override val sensorType = "датчик уровня воды"
    override val maxSensoredValue = 60

    private var isWaterConnected = false
    private var isDrainConnected = false
    private var waterLevel = 0
    private var timerMinutes: Int? = null

    override fun connectToWaterSupply() {
        isWaterConnected = true
        println("$name: подключена к водопроводу")
    }

    override fun getWater(amount: Int) {
        if (!isWaterConnected) {
            println("$name: нет подключения к водопроводу")
            return
        }
        if (waterLevel + amount > maxSensoredValue) {
            waterLevel = maxSensoredValue
            println("$name: $sensorType остановил набор воды на $maxSensoredValue л")
        } else {
            waterLevel += amount
            println("$name: набрано воды $waterLevel л")
        }
    }

    override fun connectToDrain() {
        isDrainConnected = true
        println("$name: подключена к сливу")
    }

    override fun drain() {
        if (!isDrainConnected) {
            println("$name: слив не подключён")
            return
        }
        waterLevel = 0
        println("$name: вода слита")
    }

    override fun setTimer(time: Int) {
        if (!checkPower("установить таймер")) return
        timerMinutes = time
        println("$name: таймер установлен на $time мин")
    }

    override fun startMonitoring() {
        println("$name: $sensorType работает (предел $maxSensoredValue л)")
    }

    override fun execute() {
        if (!checkPower("запустить")) return
        if (isOpen) {
            println("$name: запуск невозможен, пока открыто")
            return
        }
        if (!isWaterConnected || !isDrainConnected) {
            println("$name: сначала подключите воду и слив")
            return
        }
        if (waterLevel == 0) {
            println("$name: нет воды в барабане")
            return
        }
        super.execute()
        if (currentProgram != null) {
            startMonitoring()
            println("$name: ${timerMinutes?.let { "таймер $it мин" } ?: "таймер не задан"}")
        }
    }
}