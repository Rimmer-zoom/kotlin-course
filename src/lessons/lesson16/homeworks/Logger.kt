package lessons.lesson16.homeworks

class Logger {

    fun log(message: String) {
        log(LogLevel.INFO, message)
    }

    fun log(level: LogLevel, message: String) {
        val line = "[$level] $message"
        when (level) {
            LogLevel.WARNING -> println("${Ansi.YELLOW}$line${Ansi.RESET}")
            LogLevel.ERROR -> println("${Ansi.WHITE_ON_RED}$line${Ansi.RESET}")
            else -> println(line)
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    fun log(exception: Exception) {
        log(LogLevel.ERROR, exception.message ?: "Неизвестная ошибка")
    }
}