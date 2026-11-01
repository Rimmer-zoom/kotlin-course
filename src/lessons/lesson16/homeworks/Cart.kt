package lessons.lesson16.homeworks

class Cart {
    private val items = mutableMapOf<Int, Int>()

    fun addToCart(itemId: Int) {
        addToCart(itemId, 1)
    }

    fun addToCart(itemId: Int, amount: Int) {
        if (amount <= 0) {
            println("Ошибка: количество должно быть положительным, получено $amount")
            return
        }
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    fun addToCart(newItems: Map<Int, Int>) {
        for ((itemId, amount) in newItems) {
            addToCart(itemId, amount)
        }
    }

    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    override fun toString(): String {
        return buildString {
            appendLine("+---------+------------+")
            appendLine("| Артикул | Количество |")
            appendLine("+---------+------------+")
            for ((itemId, amount) in items.entries.sortedBy { it.key }) {
                appendLine("| ${itemId.toString().padStart(7)} | ${amount.toString().padStart(10)} |")
            }
            appendLine("+---------+------------+")
            append("Артикулов: ${items.size}, всего единиц товара: ${items.values.sum()}")
        }
    }
}