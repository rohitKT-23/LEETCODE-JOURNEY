class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int str1 = s1.length();
        int str2 = s2.length();
        if (str1 + str2 != s3.length()) {
            return false;
        }
        boolean[][] dp = new boolean[str1 + 1][str2 + 1];
        dp[0][0] = true;
        for (int i = 1; i <= str1; i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        for (int i = 1; i <= str2; i++) {
            dp[0][i] = dp[0][i - 1] && s2.charAt(i - 1) == s3.charAt(i - 1);
        }
        for (int i = 1; i <= str1; i++) {
            for (int j = 1; j <= str2; j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
        return dp[str1][str2];
    }
}