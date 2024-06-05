class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] chr = String.valueOf(n).toCharArray();
        int len = chr.length;
        int nisshaan = len;
        for (
            int i = len - 1; 
            i > 0; 
            i--) {
            if (chr[i] < chr[i - 1]) {

                nisshaan = i;
                chr[i - 1]--;
            }
        }
        for (
            int i = nisshaan; 
            i < len; 
            i++) {
            chr[i] = '9';
        }
        return Integer.parseInt(new String(chr));
    }
}