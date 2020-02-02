import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    var exit = false
    while(scanner.hasNextInt() and !exit) {
        val nextInt = scanner.nextInt()
        exit = nextInt == 0
        list.add(nextInt)
    }
    println(list.sum())
}
