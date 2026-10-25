package lessons.lesson15.homeworks

fun main() {
    println("--- Фигуры ---")
    val triangle = Triangle(3.0, 4.0, 5.0)
    triangle.describe()
    println("Периметр: ${triangle.perimeter()}")
    val quadrilateral = Quadrilateral(2.0, 3.0, 2.0, 3.0)
    quadrilateral.describe()
    println("Периметр: ${quadrilateral.perimeter()}")
    Circle(2.0).describe()

    println("--- Учебные заведения ---")
    val institutions = listOf(
        School("№ 57", "Москва, ул. Мира, 5", 11),
        TechnicalUniversity("МГТУ", "Москва", 12, 40),
        MedicalUniversity("Сеченовский", "Москва", 8, 5)
    )
    institutions.forEach { it.describe() }

    println("--- Мебель ---")
    val furniture = listOf(
        Table("Обеденный стол", "дерево", 6),
        Armchair("Кресло-качалка", "дерево", 4, true),
        OfficeChair("Офисное кресло", "пластик", 5, true)
    )
    furniture.forEach { it.describe() }

    println("--- Материалы ---")
    val first = InsertFirstMaterial()
    first.addMaterial("песок")
    first.addMaterial("глина")
    first.insert("камень")
    first.printContainer()

    println("---")
    val oneByOne = InsertOneByOneMaterials()
    oneByOne.addMaterial("песок")
    oneByOne.addMaterial("глина")
    oneByOne.addMaterial("гравий")
    oneByOne.insert(listOf("цемент", "вода"))
    oneByOne.printContainer()

    println("---")
    val sorted = InsertSortedMaterials()
    sorted.addMaterial("песок")
    sorted.addMaterial("глина")
    sorted.addMaterial("гравий")
    sorted.insert("бетон")
    sorted.printContainer()

    println("---")
    val map = InsertMapMaterials()
    map.addMaterial("песок")
    map.addMaterial("глина")
    map.insert(mapOf("цемент" to "бетон", "вода" to "раствор"))
    map.printContainer()
}