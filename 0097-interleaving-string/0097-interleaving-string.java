class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int str1 = s1.length();
        int str2 = s2.length();
        if (str1 + str2 != s3.length()) {
            return false;
        }
        boolean[][] dp = new boolean[str1 + 1][str2 + 1];
        dp[0][0] = true;
        for (int str = 1; str <= str1; str++) {
            dp[str][0] = dp[str - 1][0] && s1.charAt(str - 1) == s3.charAt(str - 1);
        }
        for (int str = 1; str <= str2; str++) {
            dp[0][str] = dp[0][str - 1] && s2.charAt(str - 1) == s3.charAt(str - 1);
        }
        for (int str = 1; str <= str1; str++) {
            for (int j = 1; j <= str2; j++) {
                dp[str][j] = (dp[str - 1][j] && s1.charAt(str - 1) == s3.charAt(str + j - 1)) || (dp[str][j - 1] && s2.charAt(j - 1) == s3.charAt(str + j - 1));
            }
        }
        return dp[str1][str2];
    }
}