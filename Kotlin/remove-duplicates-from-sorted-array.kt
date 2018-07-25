class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size == 0 || nums.size == 1) return nums.size
        var i = 0
        var j = 1
        var newSize = 1
        while (j < nums.size) {
            if (nums[i] < nums[j]) {
                nums[i + 1] = nums[j]
                i++
                j++
                newSize++
            } else {
                j++
            }
        }
        return newSize
    }
}
