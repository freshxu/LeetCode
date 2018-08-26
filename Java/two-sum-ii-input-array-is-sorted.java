class Solution {
     public int[] twoSum(int[] numbers, int target) {
        int[] nums = {0, 0};
        int length = numbers.length;
        if (length == 0 || (length == 2 && (numbers[0] + numbers[1]) != target)) {
            return nums;

        }
        int i = 0;
        int j = length - 1;
        while (i <= length) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                nums[0] = i + 1;
                nums[1] = j + 1;
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return nums;
    }
}
