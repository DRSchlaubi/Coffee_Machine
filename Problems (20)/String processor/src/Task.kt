import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val first = scanner.nextLine()
    val op = scanner.nextLine()
    val second = scanner.nextLine()
    println(when (op) {
        "equals" -> first == second
        "plus" -> first + second
        "endsWith" -> first.endsWith(second)
        else -> "Unknown operation"
    })
}
