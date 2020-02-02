import java.util.*

// write your code here
fun divide(a: Long, b: Long) = a.toDouble() / b.toDouble()

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    println(divide(a, b))
}