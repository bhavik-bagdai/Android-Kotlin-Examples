fun main() {
    val num = 15
    val res = when {
        num % 2 == 0 -> "Even"
        else -> "Odd"
    }

    println("Result: $res")
}