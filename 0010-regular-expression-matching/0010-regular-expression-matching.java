class Solution {
    public boolean isMatch(String s, String p) {
        int str_1 = s.length();
        int str_2 = p.length();
        boolean[][] DP = new boolean[str_1 + 1][str_2 + 1];
        DP[0][0] = true;

        for (int str2 = 1; str2 <= str_2; str2++) {
            if (p.charAt(str2 - 1) == '*') {
                DP[0][str2] = DP[0][str2 - 2];
            }
        }

        for (int str1 = 1; str1 <= str_1; str1++) {
            for (int str2 = 1; str2 <= str_2; str2++) {
                char sc = s.charAt(str1 - 1);
                char pc = p.charAt(str2 - 1);

                if (sc == pc || pc == '.') {
                    DP[str1][str2] = DP[str1 - 1][str2 - 1];
                    
                } else if (pc == '*') {
                    if (str2 >= 2) {
                        char ppc = p.charAt(str2 - 2);
                        if (ppc == sc || ppc == '.') {
                            DP[str1][str2] = DP[str1][str2 - 2] || DP[str1 - 1][str2];
                        } else {
                            DP[str1][str2] = DP[str1][str2 - 2];
                        }
                    }
                }
            }
        }
        return DP[str_1][str_2];
    }
}