fun main() {
    val rev = revers(1534236469)
    println("Reverse number is : $rev")
}

fun revers(x: Int): Int {
    val isPositive = (x > 0)
    val sign = if (isPositive) {
        1
    } else {
        -1
    }
    var number = x * sign

    var reverse = 0

    while (number > 0) {
        if (reverse * sign < Int.MIN_VALUE / 10 || reverse * sign > Int.MAX_VALUE / 10) {
            return 0
        }
        reverse = reverse * 10 + number % 10
        number /= 10
    }
    return reverse * sign
}

/*fun revers(x: Int): Int {
    var x = x
    var signMultiplier = 1
    if (x < 0) {
        signMultiplier = -1
        x *= signMultiplier
    }
    var res = 0
    while (x > 0) {

        // Check if the result is within MaxInt32 and MinInt32 bounds
        if (res * signMultiplier > Int.MAX_VALUE / 10 || res * signMultiplier < Int.MIN_VALUE / 10) {
            return 0
        }
        // Add the current digit into result
        res = res * 10 + x % 10
        x /= 10
    }
    // Restore to original sign of number (+ or -)
    return (signMultiplier * res)
}*/
