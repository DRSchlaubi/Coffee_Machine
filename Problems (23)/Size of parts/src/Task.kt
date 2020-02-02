import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var fixed = 0
    var rejected = 0
    var perfect = 0
    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            1 -> fixed++
            -1 -> rejected++
            0 -> perfect++
        }
    }
    print("$perfect $fixed $rejected")
}
