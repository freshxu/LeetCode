class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var position = 0
        for (index in nums.indices) {
            if (nums[index] != `val`) {
                nums[position] = nums[index]
                position++
            }
        }
        return position
    }
}
