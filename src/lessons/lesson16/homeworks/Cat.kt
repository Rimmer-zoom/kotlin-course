package lessons.lesson16.homeworks

class Cat : Animal() {
    override fun makeSound() {
        println("${Ansi.MAGENTA}Мяу${Ansi.RESET}")
    }
}