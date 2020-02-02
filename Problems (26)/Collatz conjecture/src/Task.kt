import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val amount = scanner.nextInt()

    print(func(amount))
}

fun func(amount: Int): String {
    val numbers = mutableListOf<Int>()
    repeat(amount) { num ->
        val number = num + 1
        repeat(number) {
            numbers += number
        }
    }
    return numbers.subList(0, amount).joinToString(" ")
}
