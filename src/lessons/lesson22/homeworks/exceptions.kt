package lessons.lesson22.homeworks

fun main() {
    // 1. NullPointerException
    try {
        null!!
    } catch (e: NullPointerException) {
        println("It is NullPointerException!")
    }

    // 2. IndexOutOfBoundsException
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("It is IndexOutOfBoundsException!")
    }

    // 3. ClassCastException
    try {
        "" as Int
    } catch (e: ClassCastException) {
        println("It is ClassCastException!")
    }

    // 4. IllegalArgumentException
    try {
        require(false)
    } catch (e: IllegalArgumentException) {
        println("It is IllegalArgumentException!")
    }

    // 5. NumberFormatException
    try {
        "".toInt()
    } catch (e: NumberFormatException) {
        println("It is NumberFormatException!")
    }

    // 6. IllegalStateException
    try {
        check(false)
    } catch (e: IllegalStateException) {
        println("It is IllegalStateException!")
    }

    // 7. OutOfMemoryError
    try {
        ByteArray(Int.MAX_VALUE)
    } catch (e: OutOfMemoryError) {
        println("It is OutOfMemoryError!")
    }

    // 8. StackOverflowError
    try {
        infiniteRecursion()
    } catch (e: StackOverflowError) {
        println("It is StackOverflowError!")
    }
}

fun infiniteRecursion() {
    infiniteRecursion()
}