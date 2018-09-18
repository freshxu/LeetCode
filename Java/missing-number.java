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


// solution 2
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}