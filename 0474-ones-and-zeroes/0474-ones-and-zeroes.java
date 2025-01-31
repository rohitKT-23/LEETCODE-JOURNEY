class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int ones1 = 0;
            int zeroes2 = 0;
            for (char chr : s.toCharArray()) {
                if (chr == '1') {
                    ones1++;
                } else {
                    zeroes2++;
                }
            }
            for (int one = m; one >= zeroes2; one--) {
                for (int zero = n; zero >= ones1; zero--) {
                    dp[one][zero] = Math.max(dp[one][zero], dp[one - zeroes2][zero - ones1] + 1);
                }
            }
        }
        return dp[m][n];
    }
}