package lessons.lesson19.homeworks

class StringValidator : Validator<String?> {

    override fun validate(element: String?): Boolean {
        return element != null && element.isNotBlank()
    }
}

