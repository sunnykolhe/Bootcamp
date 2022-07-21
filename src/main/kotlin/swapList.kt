import java.util.*

fun main() {
    val nums = arrayOf(10, 20, 30, 40, 50)
    Collections.swap(nums.asList(), 1, 3)
    println(nums.contentToString())
}