package lessons.lesson17.homeworks

class ArcadeMachine(
    val color: String,
    val model: String,
    val hasJoystick: Boolean,
    var owner: String,
    var supportPhone: String,
    var sessionPrice: Int,
    private val pinCode: String
) {
    var isOn: Boolean = false
        private set

    var isOsLoaded: Boolean = false
        private set

    var isSessionPaid: Boolean = false
        private set

    private val installedGames = mutableListOf<String>()

    private var balance: Int = 0

    fun turnOn() {
        TODO()
    }

    fun turnOff() {
        TODO()
    }

    fun loadOs() {
        TODO()
    }

    fun shutdownOs() {
        TODO()
    }

    fun showGames(): List<String> {
        TODO()
    }

    fun startGame(gameName: String): Boolean {
        TODO()
    }

    fun paySession(amount: Int): Boolean {
        TODO()
    }

    fun collectCash(pin: String): Int {
        TODO()
    }

    private fun openSafeAndDispenseCash(): Int {
        TODO()
    }
}