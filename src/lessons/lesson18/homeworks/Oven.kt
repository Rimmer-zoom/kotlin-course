package lessons.lesson18.homeworks

class Oven : TemperatureOpenableEquipment("Духовка", 300), Timable, LightEmitting, AutomaticShutdown {

    override val sensorType = "датчик перегрева"
    override val maxSensoredValue = 300

    private var timerMinutes: Int? = null

    override fun setTimer(time: Int) {
        if (!checkPower("установить таймер")) return
        timerMinutes = time
        println("$name: таймер установлен на $time мин")
    }

    override fun emitLight() {
        println("$name: подсветка включена")
    }

    override fun completeLiteEmission() {
        println("$name: подсветка выключена")
    }

    override fun startMonitoring() {
        println("$name: $sensorType работает (предел $maxSensoredValue°C)")
    }

    override fun execute() {
        if (!checkPower("запустить")) return
        if (isOpen) {
            println("$name: запуск невозможен, пока открыто")
            return
        }
        super.execute()
        if (currentProgram != null) {
            println("$name: ${timerMinutes?.let { "таймер $it мин" } ?: "таймер не задан"}")
            emitLight()
            startMonitoring()
        }
    }
}