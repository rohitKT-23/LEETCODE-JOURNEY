class Solution {
    public int minimumLength(String s) {
        int str_1 = 0;
        int str_len = s.length() - 1;
        while (str_1 < str_len) {

            if (s.charAt(str_1) != s.charAt(str_len)) {
                break;
            }
            char chr = s.charAt(str_1);
            
            while (
                str_1 <= str_len 
                && 
                s.charAt(str_1) == chr
                ) {
                str_1++;
            }
            while (
                str_1 <= str_len 
                && 
                s.charAt(str_len) == chr
                ) {
                str_len--;
            }
        }
        return str_len - str_1 + 1;
    }
}