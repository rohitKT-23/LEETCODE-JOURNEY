class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        
        int mvs = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int newValue = nums[i - 1] + 1;
                mvs += newValue - nums[i];
                nums[i] = newValue;
            }
        }
        
        return mvs;
    }
}