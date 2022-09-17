import java.util.*

fun main(args: Array<String>) {

    val list1 = LinkedList<Int>()
    list1.addAll(listOf(9,9,9,9,9,9,9))

    val list2 = LinkedList<Int>()
    list2.addAll(listOf(9,9,9,9))

    add(list1, list2)

}

fun add(l1: LinkedList<Int>, l2: LinkedList<Int>) {
    val result = LinkedList<Int>()
    var hasCarry = false
    val node1Iterator = l1.iterator()
    val node2Iterator = l2.iterator()

    while (node1Iterator.hasNext() || node2Iterator.hasNext()) {
        var sum = 0
        sum += if (!node1Iterator.hasNext()) {
            node2Iterator.next()
        } else if (!node2Iterator.hasNext()) {
            node1Iterator.next()
        } else {
            (node1Iterator.next() + node2Iterator.next())
        }

        if (hasCarry) {
            sum++
        }
        if (sum >= 10) {
            sum %= 10
            hasCarry = true
        }else{
            hasCarry = false
        }
        result.add(sum)

    }

    if (hasCarry) result.add(1)

    println(result)

}