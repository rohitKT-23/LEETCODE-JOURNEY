class Solution {
    public int jump(int[] nums) {

        int t_nums =nums.length;
        int[] dp =new int[t_nums];

        for (
            int num1 = 1; 
            num1 < t_nums; 
            num1++
            ) {
                
            dp[num1] =Integer.MAX_VALUE;
        }

        for (int num1 = 0; num1 < t_nums; num1++) {
            for (int num2 = 1; num2 <= nums[num1]; num2++) {

                if (num1 + num2 < t_nums) {
                    dp[num1 + num2] = Math.min(dp[num1 + num2], dp[num1] + 1);

                }
            }
        }
        return dp[t_nums - 1];
    }
}