package lessons.lesson15.homeworks

class MedicalUniversity(
    name: String,
    address: String,
    facultiesCount: Int,
    val clinicsCount: Int
) : University(name, address, facultiesCount) {
    override fun describe() {
        super.describe()
        println("Клиник: $clinicsCount")
    }
}