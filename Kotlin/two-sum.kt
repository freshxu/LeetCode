class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
      val map: HashMap<Int, Int> = hashMapOf()
        for (key in nums.indices) {
            if (map.containsKey(target - nums[key])) {
                val resultArray: IntArray = intArrayOf(map.get(target - nums[key]) ?: 0,key)
                return resultArray
            }
            map.put(nums[key],key)
        }
        throw IllegalArgumentException("No two sum solution")
    }
}
