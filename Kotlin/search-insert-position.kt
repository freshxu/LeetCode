class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums == null || nums.size == 0) return 0
        if (nums[0] >= target) return 0
        if (nums[nums.size - 1] < target) return nums.size
        
        var start = 0
        var end = nums.size - 1
        while (start < end) {
            var middle = (end + start) / 2
            if (nums[middle] == target) {
                return middle
            } else if (nums[middle] > target) {
                end = middle
            } else {
                start = middle + 1
            }
        }
        return start
    }
}
