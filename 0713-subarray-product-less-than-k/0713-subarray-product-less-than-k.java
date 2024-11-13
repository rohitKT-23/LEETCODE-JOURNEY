class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int prdt = 1;
        int jawab = 0;
        int lft = 0;
        
        for (int rht = 0; rht < nums.length; rht++) {
            prdt *= nums[rht];
            while (prdt >= k) prdt /= nums[lft++];
            jawab += rht - lft + 1;
        }
        return jawab;
    }
}