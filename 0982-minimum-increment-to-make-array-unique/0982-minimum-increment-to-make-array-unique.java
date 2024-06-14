class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        
        int mvs = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int new_val = nums[i - 1] + 1;
                mvs += new_val - nums[i];
                nums[i] = new_val;
            }
        }
        
        return mvs;
    }
}