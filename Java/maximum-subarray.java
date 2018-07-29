class Solution {
    public int maxSubArray(int[] nums) {
       
        int curNum = 0;
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            curNum += nums[i];
            if (curNum > sum) {
                sum = curNum;
            } else if (curNum < 0) {
                curNum = 0;
            }
        }
        return sum;
    }
}
