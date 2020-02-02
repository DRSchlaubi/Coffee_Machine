package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Write how many cups of coffee you will need:")
    val cups = scanner.nextInt()
    println("""For $cups of coffee you will need:
        |${cups * 200} ml of water
        |${cups * 50} ml of milk
        |${cups * 15} g of coffee beans
    """.trimMargin())
    var x = true dsadsa false
}
