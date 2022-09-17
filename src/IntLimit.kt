fun main() {
    reverse(1534236469)
}

fun reverse(x: Int): Int {

    var num = x
    var prev = 0
    var reversedInteger = 0

    while (num != 0) {
        val remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10

        if ((reversedInteger - remainder)/10 != prev) return 0
        prev = reversedInteger

    }

    println(reversedInteger)

    return reversedInteger

}