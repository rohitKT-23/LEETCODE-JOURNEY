class Solution {
    public int minNonZeroProduct(int p) {

      final long n = 1L << p;
      final long hlf_cnt = n / 2 - 1;

      return (int) (pwr_mod(n - 2, hlf_cnt) * ((n - 1) % 1_000_000_007) % 1_000_000_007);
    }
    
    public long pwr_mod(long x, long n) {
      if (n == 0){
        return 1L;
      }

      x %= 1_000_000_007;

      if (n % 2 == 1)

        return x * pwr_mod(x, n - 1) % 1_000_000_007;
        
      return pwr_mod(x * x, n / 2) % 1_000_000_007;
    }
  }