fun main() {
    for (i in 1..5) {
        if (i == 3) break // Exits loop when i is 3
        if (i == 2) continue // Skips the current iteration when i is 2
        println(i)
    }
}
