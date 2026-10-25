package lessons.lesson15.homeworks

class InsertMapMaterials : Materials() {
    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach { addMaterial(it) }
    }
}