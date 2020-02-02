// Posted from EduTools plugin
import java.util.Scanner

enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    Latvia("Euro")

}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val first = input.next()
    val second = input.next()
    println(first.toCountry().currency == second.toCountry().currency)
}

fun String.toCountry() = Country.valueOf(this)
