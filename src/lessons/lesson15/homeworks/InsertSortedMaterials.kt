package lessons.lesson15.homeworks

class InsertSortedMaterials : Materials() {
    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach { addMaterial(it) }
    }
}