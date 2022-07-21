fun<T> isEqual(first: List<T>, second: List<T>): Boolean {

    if (first.size != second.size) {
        return false
    }

    first.forEachIndexed { index, value -> if (second[index] != value) { return false} }
    return true
}

fun main() {
    val first = listOf(1, 2, 3, 4, 5)
    val second = listOf(1, 2, 3, 4, 5)

    val isEqual = isEqual(first, second)

    println(isEqual)        // true
}