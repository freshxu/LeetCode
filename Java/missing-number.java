class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 2) {
                return i + 1;
            }
        }
        return nums.length;
    }
}
