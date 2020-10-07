package no.nav

class Person(private val name: String, private val address: Address) {
    fun printMe() = println("$name lives at $address")
}

data class Address(val street: String, val houseNumber: Int)

fun main() {
    val address = Address("Storgata", 22)
    val per = Person("Per", address)
    per.printMe()
}