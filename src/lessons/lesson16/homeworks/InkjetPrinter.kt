package lessons.lesson16.homeworks

class InkjetPrinter : Printer() {
    // пары "цвет текста; цвет фона"
    private val colors = listOf(
        "\u001B[97;41m",  // белый на красном
        "\u001B[30;42m",  // чёрный на зелёном
        "\u001B[30;43m",  // чёрный на жёлтом
        "\u001B[97;44m",  // белый на синем
        "\u001B[97;45m",  // белый на пурпурном
        "\u001B[30;46m"   // чёрный на голубом
    )

    override fun print(text: String) {
        val words = text.split(" ")
        for (i in words.indices) {
            kotlin.io.print("${colors[i % colors.size]}${words[i]}${Ansi.RESET} ")
        }
        println()
    }
}