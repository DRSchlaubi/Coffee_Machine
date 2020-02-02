import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val character = scanner.nextInt()
    println("""Symbol # $character of the string "$input" is '${input[character - 1]}'""")
}
