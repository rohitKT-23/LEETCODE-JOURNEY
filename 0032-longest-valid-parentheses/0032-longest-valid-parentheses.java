class Solution {
    public int longestValidParentheses(String s) {

        int t_str = s.length();
        int[] dp = new int[t_str];
        int max = 0;

        for (int str = 1; str < t_str; str++) {

            if (s.charAt(str) == ')') {
                if (s.charAt(str - 1) == '(') {

                    dp[str] = (str >= 2 ? dp[str - 2] : 0) + 2;

                } else if (str - dp[str - 1] > 0 && s.charAt(str - dp[str - 1] - 1) == '(') {
                    
                    dp[str] = dp[str - 1] + (str - dp[str - 1] >= 2 ? dp[str - dp[str - 1] - 2] : 0) + 2;
                }
                max = Math.max(max, dp[str]);
            }
        }
        return max;
    }
}