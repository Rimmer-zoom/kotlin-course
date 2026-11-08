package lessons.lesson17.homeworks

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // Ответ: это параметр конструктора, main() передаёт его при создании объекта. А читать
    // publicVal через объект можно потому, что публичное свойство publicVal унаследовано
    // от BaseClass.
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // Ответ: getAll() публичный метод BaseClass, а ChildrenClass его наследует.
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // Ответ: печатается "Печать из класса BaseClass". Приватные методы не наследуются и не
    // переопределяются: privatePrint() здесь просто новая функция, никак не связанная
    // с родительской. printText() объявлен в BaseClass и вызывает его собственный privatePrint().
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    // пункты 3 и 4: разрешаем любое непустое значение, чтобы работало и длинное имя
    override fun verifyPublicField(value: String): Boolean {
        return value.isNotBlank()
    }

    // пункт 5: публичный "сеттер" для protected-поля
    fun changeProtectedField(value: String) {
        protectedField = value
    }
}