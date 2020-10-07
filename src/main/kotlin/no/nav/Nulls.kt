package no.nav

fun main() {
    val ordinaryString: String = "Hello!"
    println(ordinaryString)
    val possibleString: String? = null
    println(possibleString?.toUpperCase() ?: "nothing to see here...")
    val anotherPossibleString: String? = "Hello!"
    println(anotherPossibleString?.toUpperCase() ?: "nothing to see here...")
}