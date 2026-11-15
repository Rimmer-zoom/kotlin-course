package lessons.lesson19.homeworks

class ListValidator<T : Number> : Validator<List<T?>> {

    override fun validate(element: List<T?>): Boolean {
        return element.all { it != null && it.toDouble() != 0.0 }
    }
}

