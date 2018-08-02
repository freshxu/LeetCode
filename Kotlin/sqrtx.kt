class Solution {
    fun mySqrt(x: Int): Int {
        var left = 0
        var right = x
        while (left <= right) {
            var middle = (left + right) / 2
            if (middle * middle > x) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return left - 1 
    }
}
