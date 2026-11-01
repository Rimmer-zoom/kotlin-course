package lessons.lesson16.homeworks

class LaserPrinter : Printer() {
    override fun print(text: String) {
        for (word in text.split(" ")) {
            kotlin.io.print("${Ansi.BLACK_ON_WHITE}$word${Ansi.RESET} ")
        }
        println()
    }
}