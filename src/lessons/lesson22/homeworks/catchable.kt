package lessons.lesson22.homeworks

fun catchable(arg: Any?) {
    try {
        arg!!                                       // NullPointerException
        arg as List<*>                              // ClassCastException
        arg[2]                                      // IndexOutOfBoundsException
        require(arg[2] is String)                   // IllegalArgumentException
        check((arg[2] as String).toInt() == 3)      // NumberFormatException / IllegalStateException
    } catch (e: Throwable) {
        val result = when (e) {
            is NullPointerException -> "It is NullPointerException"
            is IndexOutOfBoundsException -> "It is IndexOutOfBoundsException"
            is ClassCastException -> "It is ClassCastException"
            is NumberFormatException -> "It is NumberFormatException"
            is IllegalArgumentException -> "It is IllegalArgumentException"
            is IllegalStateException -> "It is IllegalStateException"
            else -> "It is unknown exception"
        }
        println(result)
        throw e
    }
    println("Переданный аргумент фантастически хорош!")
}

fun main() {
    // catchable(null)                 // NullPointerException
    // catchable("WTF?")               // ClassCastException
    // catchable(listOf(""))           // IndexOutOfBoundsException
    // catchable(listOf(1, 2, 3))      // IllegalArgumentException
    // catchable(listOf(1, 2, "WTF?")) // NumberFormatException
    // catchable(listOf(1, 2, "5"))    // IllegalStateException
    catchable(listOf(1, 2, "3"))        // успех: "фантастически хорош"
}

