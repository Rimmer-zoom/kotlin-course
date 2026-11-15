package lessons.lesson19.homeworks

fun <T> getMiddleElement(list: List<T>): T? {
    if (list.size % 2 == 0) {
        return null
    }
    return list[list.size / 2]
}