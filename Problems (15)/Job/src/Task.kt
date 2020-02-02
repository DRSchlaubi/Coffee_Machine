import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println(if (scanner.nextInt() in 18..59) "YES" else "NO")
}