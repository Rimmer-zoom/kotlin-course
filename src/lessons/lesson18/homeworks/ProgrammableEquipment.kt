package lessons.lesson18.homeworks

abstract class ProgrammableEquipment(name: String) : PowerableEquipment(name), Programmable {
    var currentProgram: String? = null
        private set

    override fun programAction(action: String) {
        if (!checkPower("задать режим «$action»")) return
        currentProgram = action
        println("$name: задан режим «$action»")
    }

    override fun execute() {
        if (!checkPower("запустить")) return
        val program = currentProgram
        if (program == null) {
            println("$name: режим не задан")
            return
        }
        println("$name: выполняется режим «$program»")
    }

    override fun powerOff() {
        super.powerOff()
        currentProgram = null
    }
}