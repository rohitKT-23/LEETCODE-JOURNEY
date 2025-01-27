class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int fun = 0;
        for (
            int num = 0; 
            num < nums.length;
            num++
            ) {
            sum += nums[num];
            fun += num * nums[num];
        }
        int ans = fun;
        for (
            int num = nums.length - 1; 
            num >= 1; 
            num--) {
            fun = fun + sum - nums.length * nums[num];
            ans = Math.max(ans, fun);
        }
        return ans;
    }
}