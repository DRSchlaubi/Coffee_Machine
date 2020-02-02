fun main() = with(readLine()!!.split(" ")) {
    println(this == this.distinct())
}