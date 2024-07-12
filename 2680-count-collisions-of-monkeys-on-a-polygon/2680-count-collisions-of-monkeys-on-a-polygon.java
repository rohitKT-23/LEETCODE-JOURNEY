class Solution {
    public int monkeyMove(int n) {

      final int ans = (int) modPow(2, n) - 2;
      return ans < 0 ? ans + 1000000007 : ans;
    }
    
    public long modPow(long x, long n) {

      if (n == 0){
        return 1;
      }

      if (n % 2 == 1){
        return x * modPow(x, n - 1) % 1000000007;
      }

      return modPow(x * x % 1000000007, n / 2);
    }
  }