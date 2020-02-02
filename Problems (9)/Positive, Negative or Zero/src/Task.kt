fun main() {
    val input = readLine()!!.toInt()
    when {
        input > 0 -> {
            println("positive")
        }
        input == 0 -> {
            println("zero")
        }
        else -> {
            println("negative")
        }
    }
}