package lessons.lesson19.homeworks

class ListHolder<T> {
    private val elements = mutableListOf<T>()

    fun add(element: T) {
        elements.add(element)
    }

    fun getAll(): List<T> {
        return elements.toList()
    }
}