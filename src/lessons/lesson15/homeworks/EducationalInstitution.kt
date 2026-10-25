package lessons.lesson15.homeworks

open class EducationalInstitution(val name: String, val address: String) {
    open fun describe() {
        println("Учебное заведение $name, адрес: $address")
    }
}