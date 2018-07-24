class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int repeatCount = 0;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                ++ repeatCount;
            } else {
                temp = nums[i];
                nums[i - repeatCount] = temp;
            }
        }
        return nums.length - repeatCount;
    }
}
