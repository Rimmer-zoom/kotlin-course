package lessons.lesson05.homeworks

fun main() {

    // Задача 1: затухание звука
    val baseIntensity: Double = 3.0
    val coefficient: Double? = 0.73 // но может быть null
    val baseCoefficient = 0.5
    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)
    println("Интенсивность после затухания: $resultIntensity")

    // Задача 2: стоимость доставки со страховкой
    val defaultCost: Double = 50.0
    val cost: Double? = 20.0 // но может быть null
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005
    val insuranceCost = (cost ?: defaultCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost
    println("Полная стоимость доставки: $totalCost")

    // Задача 3: атмосферное давление
    val pressure: String? = "34.6" // но может быть null
    val attentionMessage = "Attention, pressure is lost"
    val pressureForLab = pressure ?: attentionMessage
    println("Показание давления: $pressureForLab")
}