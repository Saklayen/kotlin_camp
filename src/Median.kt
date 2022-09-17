fun main(){
    getMedian(intArrayOf(1, 3), intArrayOf(2))

}
fun getMedian(nums1: IntArray, nums2: IntArray): Double{
    val concatenatedArray = (nums1 + nums2)
    concatenatedArray.sort()
    val concatenatedArraySize = concatenatedArray.size
    var median: Double = if(concatenatedArray.size%2 == 0){
        ((concatenatedArray[((concatenatedArraySize/2)-1)] + concatenatedArray[(concatenatedArraySize/2)]).toDouble() / 2)
    }else{
        concatenatedArray[concatenatedArraySize/2].toDouble()
    }
    println(concatenatedArray.contentToString()+ median)
    return median

}