class Solution {
    public int minDistance(String word1, String word2) {

        int wrd1_len = word1.length();
        int wrd2_len = word2.length();
        int[] dp = new int[wrd2_len + 1];

        for (int wrd1 = 0; wrd1 <= wrd1_len; wrd1++) {
            int[] tmp = new int[wrd2_len + 1];

            for (int wrd2 = 0; wrd2 <= wrd2_len; wrd2++) {

                if (wrd1 == 0 || wrd2 == 0) {
                    tmp[wrd2] = wrd1 + wrd2;
                } else {

                    if (word1.charAt(wrd1 - 1) == word2.charAt(wrd2 - 1)) {
                        tmp[wrd2] = dp[wrd2 - 1];

                    } else {
                        tmp[wrd2] = Math.min(dp[wrd2], tmp[wrd2 - 1]) + 1;
                    }
                }
            }

            dp = tmp;
        }
        return dp[wrd2_len];
    }
}