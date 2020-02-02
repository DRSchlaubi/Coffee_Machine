fun main() {
    val input = readLine()!!.toInt()
    val range = (-15..12) + (14..17)
    println(input in range || input >=19)
}