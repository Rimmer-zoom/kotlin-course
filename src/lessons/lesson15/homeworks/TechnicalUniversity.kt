package lessons.lesson15.homeworks

class TechnicalUniversity(
    name: String,
    address: String,
    facultiesCount: Int,
    val laboratoriesCount: Int
) : University(name, address, facultiesCount) {
    override fun describe() {
        super.describe()
        println("Лабораторий: $laboratoriesCount")
    }
}