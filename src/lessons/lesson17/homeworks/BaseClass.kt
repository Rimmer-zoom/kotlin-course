package lessons.lesson17.homeworks

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // Ответ: в main() читается не поле BaseClass, а свойство privateVal самого ChildrenClass:
    // оно объявлено в его конструкторе как val и потому публичное. Приватное поле
    // BaseClass снаружи по-прежнему недоступно, это просто другое свойство с тем же именем.
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    // Ответ: protected виден только внутри самого класса и его наследников, а main() не
    // принадлежит иерархии. В ChildrenClass одноимённый аргумент это просто параметр
    // конструктора, свойства там нет.
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        // Ответ на 3 и 4: сеттер пропускает значение только если verifyPublicField(value) вернёт true,
        // а в BaseClass это value.length < 3. Имя актёра длиннее, поэтому оно отклонялось.
        // BaseClass менять нельзя, поэтому в ChildrenClass переопределяем verifyPublicField.
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    // 5. измени меня из функции main() через сеттер в наследнике
    // Ответ: в ChildrenClass добавлен публичный метод changeProtectedField(), он имеет доступ
    // к protected-полю и меняет его. Названия setProtectedField не берём: оно совпало бы
    // с JVM-сеттером этого свойства.
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"

    // 6. добавь сеттер чтобы изменить меня из main()
    // Ответ: из ChildrenClass это невозможно, private-члены не видны даже наследникам.
    // BaseClass менять нельзя, поэтому сеттер можно добавить только в сам BaseClass:
    //     fun changePrivateField(value: String) { privateField = value }
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. объясни, почему эта функция не может быть публичной
    // Ответ: она возвращает тип ProtectedClass, который сам protected. Функция не может быть
    // видна шире, чем тип в её сигнатуре, иначе снаружи пришлось бы работать с недоступным
    // типом. Kotlin запрещает это (ошибка "exposes its return type").
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // Ответ: generate() объявлена open и переопределена в ChildrenClass. Вызов происходит
    // внутри getAll() у объекта типа ChildrenClass, а выбор версии метода идёт по реальному
    // типу объекта (полиморфизм), поэтому печатается текст из дочернего класса.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. объясни, почему эта функция не может быть публичной или protected
    // Ответ: возвращаемый тип PrivateClass приватный внутри BaseClass. Функция с более
    // широкой видимостью (public или protected) раскрывала бы этот тип наружу, а видна
    // функция может быть не шире своего типа, значит остаётся только private.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}