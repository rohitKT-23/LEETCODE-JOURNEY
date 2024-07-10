class Solution {
    private static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even_IDX = (n + 1) / 2; 
        long odd_IDX = n / 2;        
        long even_choose = pow(5, even_IDX, MOD);
        long odd_choose = pow(4, odd_IDX, MOD);

        return (int)((even_choose * odd_choose) % MOD);
    }

    private long pow(long base, long exp, long mod) {
        long ans = 1;
        base = base % mod;

        while (exp > 0) {

            if ((exp % 2) == 1) {

                ans = (ans * base) % mod;
            }
            
            exp = exp >> 1;
            base = (base * base) % mod;
        }

        return ans;
    }
}
