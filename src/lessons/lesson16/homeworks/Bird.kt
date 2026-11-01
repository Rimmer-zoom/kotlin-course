package lessons.lesson16.homeworks

class Bird : Animal() {
    override fun makeSound() {
        println("${Ansi.CYAN}Чирик${Ansi.RESET}")
    }
}