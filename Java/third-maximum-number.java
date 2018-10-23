class Solution {
    public int thirdMax(int[] nums) {
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] != first && (nums[i] > second || second == first)) {
                third = second;
                second = nums[i];
            } else if ((nums[i] != first && nums[i] != second) && (nums[i] > third || third == second || third == first)) {
                third = nums[i];
            }
        }
        if (first > second && second > third) {
            return third;   
        } else {
            return first;
        }

    }
}
