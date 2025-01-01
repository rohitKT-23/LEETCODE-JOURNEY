class Solution {
    public int longestIdealString(String s, int k) {
      int[] dp = new int[26];
  
      for (final char c : s.toCharArray()) {
        final int i = c - 'a';
        dp[i] = 1 + t_max_reach(dp, i, k);
      }
  
      return Arrays.stream(dp).max().getAsInt();
    }
  
    public int t_max_reach(int[] dp, int i, int k) {
      final int phella = Math.max(0, i - k);
      final int aakhirii = Math.min(25, i + k);
      int max_rach = 0;
      for (int j = phella; j <= aakhirii; ++j)
        max_rach = Math.max(max_rach, dp[j]);
      return max_rach;
    }
  }