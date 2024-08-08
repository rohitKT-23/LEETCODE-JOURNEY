class Solution {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (
            int num = 1; 
            num < nums.length && cnt <= 1; 
            num++
            ) {

            if (nums[num - 1] > nums[num]) {
                cnt++;
                
                if (num - 2 < 0 || nums[num - 2] <= nums[num]) {

                    nums[num - 1] = nums[num];
                } else {
                    
                    nums[num] = nums[num - 1];
                }
            }
        }
        return cnt <= 1;
    }
}