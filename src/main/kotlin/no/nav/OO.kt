package no.nav

fun main() {
   val address = Address("Storgata", 22)
   val per = Person("Per", address)
   per.printMe()
   Circle().draw()
}

class Person(private val name: String, private val address: Address) {
   fun printMe() = println("$name lives at $address")
}

data class Address(val street: String, val houseNumber: Int)

open class Shape(name: String) {
   init {
       println("initialising $name")
   }

   open fun draw() {}
}

class Circle(): Shape("circle") {
   override fun draw() {
      println("drawing circle")
   }
}
