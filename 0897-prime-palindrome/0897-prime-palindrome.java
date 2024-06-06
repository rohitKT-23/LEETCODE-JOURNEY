class Solution {
    public int primePalindrome(int n) {
        while (true) {
            if (
                n == utlaa(n) 
                && 
                chk_prime(n)
                ) {
                return n;
            }
            n++;
            if (
                10000000 < n 
                &&
                n < 100000000) {
                n = 100000000;
            }
        }
    }
    public static int utlaa(int n) {
        int ans = 0;
        while (n > 0) {

            ans = 10 * ans + n % 10;
            n /= 10;

        }
        return ans;
    }
    public static boolean chk_prime(int n) {
        if (n < 2) {
            return false;
        }
        int root = (int) Math.sqrt(n);

        for (
            int digit = 2;
             digit <= root;
              ++digit
              ) {
                
            if (n % digit == 0) {
                return false;
            }
        }
        return true;
    }
}