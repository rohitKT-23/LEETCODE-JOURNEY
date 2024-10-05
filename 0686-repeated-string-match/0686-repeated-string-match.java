class Solution {
    public int repeatedStringMatch(String a, String b) {
        int str_1 = a.length();
        int str_2 = b.length();
        int ans = 1;
        StringBuilder str_bld = new StringBuilder(a);
        while (str_bld.length() < str_2) {
            str_bld.append(a);
            ans++;
        }
        if (str_bld.indexOf(b) >= 0) {
            return ans;
        }
        if (str_bld.append(a).indexOf(b) >= 0) {
            return ans + 1;
        }
        return -1;
    }
}