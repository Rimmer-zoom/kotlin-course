package lessons.lesson15.homeworks

class School(name: String, address: String, val classesCount: Int) : EducationalInstitution(name, address) {
    override fun describe() {
        println("Школа $name, адрес: $address, классов: $classesCount")
    }
}