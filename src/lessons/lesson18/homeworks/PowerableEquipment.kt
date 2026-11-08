package lessons.lesson18.homeworks

abstract class PowerableEquipment(val name: String) : Powerable {
    var isPoweredOn: Boolean = false
        private set

    override fun powerOn() {
        if (isPoweredOn) {
            println("$name: питание уже включено")
            return
        }
        isPoweredOn = true
        println("$name: питание включено")
    }

    override fun powerOff() {
        if (!isPoweredOn) {
            println("$name: питание уже выключено")
            return
        }
        isPoweredOn = false
        println("$name: питание выключено")
    }

    protected fun checkPower(action: String): Boolean {
        if (!isPoweredOn) {
            println("$name: нельзя $action — питание выключено")
        }
        return isPoweredOn
    }
}