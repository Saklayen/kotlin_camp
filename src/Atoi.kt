fun main(){
    myAtoi(" -test1121")
}
fun myAtoi(s: String): Int {
   var x = s.trim()
    val isNegative = x.startsWith("-", true)
    var result = x.filter { it.isDigit() }.toInt()
    if (isNegative){
        result *= -1;
    }
    println(result)
    return result
}