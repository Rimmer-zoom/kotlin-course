package lessons.lesson14.homeworks

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Полнолуние"

    fun showPhase() {
        if (isVisible) {
            println("Луна видна, текущая фаза: $phase.")
        } else {
            println("Луна сейчас не видна.")
        }
    }
}