class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } 
            if (i < nums.length - 1) {
                if (target > nums[i] && target < nums[i + 1]) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    // solution 2

    public int searchInsert(int[] nums, int target) {
    
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return start;
    }
    
}
