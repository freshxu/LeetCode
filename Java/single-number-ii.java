class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> maps = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            Integer value = maps.get(nums[i]);
            maps.put(nums[i], (value == null ? 0 : value) + 1); 
        }
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }          
        return 0;
    }
}
