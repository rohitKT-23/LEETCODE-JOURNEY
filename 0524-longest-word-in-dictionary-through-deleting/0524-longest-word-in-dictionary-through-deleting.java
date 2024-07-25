class Solution {
    public String findLongestWord(String s, List<String> dictionary) {

        String ans = "";
        for (String str : dictionary) {
            int i = 0;

            for (char c : s.toCharArray()) {
                if (
                    i < str.length() 
                    && 
                    c == str.charAt(i)) {
                    i++;
                }
            }
            if (
                i == str.length() 
                && 
                str.length() >= ans.length()
                ) {
                if (
                    str.length() > ans.length() 
                    ||
                    str.compareTo(ans) < 0) {
                    ans = str;
                }
            }
        }
        return ans;
    }
}