import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val from1 = scanner.nextInt()
    val to1 = scanner.nextInt()
    val from2 = scanner.nextInt()
    val to2 = scanner.nextInt()
    val input = scanner.nextInt()
    println(if (input in from1..to1 && input in from2..to2) "YES" else "NO")
}
