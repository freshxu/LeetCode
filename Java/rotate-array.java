public void rotate(int[] nums, int k) {
        k = (nums.length + (k % nums.length)) % nums.length;
        int tmp;
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for (int i = 0, j = k - 1; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for (int i = k, j = nums.length - 1; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        
    }
    