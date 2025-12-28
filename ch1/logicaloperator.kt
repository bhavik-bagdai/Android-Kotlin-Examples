fun main() {
    val a = true
    val b = false
    val result = a && b  // false, because both need to be true
    val resultOr = a || b  // true, because one of them is true
    val resultNot = !a  // false, because `a` is true and `!` negates it

    println(result)  // Output: false
    println(resultOr)  // Output: true
    println(resultNot)  // Output: false
}