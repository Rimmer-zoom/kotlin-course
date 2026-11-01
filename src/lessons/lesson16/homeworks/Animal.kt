package lessons.lesson16.homeworks

open class Animal {
    open fun makeSound() {
        println("${Ansi.GRAY}Это животное не издаёт звуков.${Ansi.RESET}")
    }
}