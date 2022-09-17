/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var result = ListNode(0)
        var node1 = l1
        var node2 = l2
        var hasCarry = false


        while(node1 != null || node2 != null){
            var sum = 0
            if(node1 == null){
                node2.let {
                    sum += it!!.`val`
                }
                node2 = node2!!.next
            }
            else if(node2 == null){

                node1.let {
                    sum += it!!.`val`
                }
                node1 = node1.next
            }
            else{
                node1.let {
                    sum += it!!.`val`
                }
                node2.let {
                    sum += it!!.`val`
                }
                node1 = node1.next
                node2 = node2.next
            }

            if(hasCarry){
                sum++
            }

            if(sum >= 10 ){
                sum%=10
                hasCarry = true
            }else{
                hasCarry = false
            }
            val newNode = ListNode(sum)
            result.next = newNode
        }
        if(hasCarry){
            result.next = ListNode(1)
        }

        println(result)
        return result
    }


}


class ListNode(var `val`: Int) {
        var next: ListNode? = null
}