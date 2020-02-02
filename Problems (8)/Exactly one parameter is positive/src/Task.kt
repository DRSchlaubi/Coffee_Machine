import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input1 = scanner.nextInt()
    val input2 = scanner.nextInt()
    val input3 = scanner.nextInt()
    when {
        input1 > 0 -> {
            println(input2 <= 0 && input3 <= 0)
        }
        input2 > 0 -> {
            println(input1 <= 0 && input3 <= 0)
        }
        input3 > 0 -> {
            println(input1 <= 0 && input2 <= 0)
        }
    }
}
