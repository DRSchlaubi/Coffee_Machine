import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val from = scanner.nextInt()
    val to = scanner.nextInt()
    println(if (input in from..to) "YES" else "NO")
}