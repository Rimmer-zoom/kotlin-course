package lessons.lesson16.homeworks

class Dog : Animal() {
    override fun makeSound() {
        println("${Ansi.GREEN}Гав${Ansi.RESET}")
    }
}