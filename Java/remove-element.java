class Solution {
    public int removeElement(int[] nums, int val) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[position] = nums[i];
                position++;
            } 
        }
        return position;
    }
}
