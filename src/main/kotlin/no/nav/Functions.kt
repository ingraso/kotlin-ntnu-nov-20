package no.nav

fun main() {
    println(basicFunction())
    println(add(2, 3))
    println(doStuffWithNumbers(2, 3) { x, y -> x + y })
    println(adder()(2, 3))
    println(multiplier(2, 3))
}

fun basicFunction() = listOf("one", "two", "three")

fun add(x: Int, y: Int) = x + y

fun doStuffWithNumbers(x: Int, y: Int, operation: (Int, Int) -> Int)  = operation(x, y)

fun adder() = { x: Int, y: Int -> x + y }

val multiplier = { x: Int, y: Int -> x * y }