package lessons.lesson14.homeworks

class Concert(val band: String, val location: String, val cost: Int, val capacity: Int) {

    private var ticketSold = 0

    fun buyTicket() {
        if (ticketSold < capacity) {
            ticketSold++
        }
    }

    fun printDetails() {
        println("Концерт группы $band в $location. Стоимость билета $cost. Осталось ${capacity - ticketSold} мест")
    }
}