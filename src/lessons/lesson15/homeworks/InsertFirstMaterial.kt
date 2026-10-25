package lessons.lesson15.homeworks

class InsertFirstMaterial : Materials() {
    fun insert(item: String) {
        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach { addMaterial(it) }
    }
}