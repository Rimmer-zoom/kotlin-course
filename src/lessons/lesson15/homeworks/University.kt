package lessons.lesson15.homeworks

open class University(name: String, address: String, val facultiesCount: Int) : EducationalInstitution(name, address) {
    override fun describe() {
        println("Университет $name, адрес: $address, факультетов: $facultiesCount")
    }
}