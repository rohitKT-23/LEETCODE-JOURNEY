class Solution {
  public int countHomogenous(String s) {
    final int kMod = 1_000_000_007;
    int ans = 0;
    int cnt = 0;
    char curr_chr = '@';

    for (final char c : s.toCharArray()) {
      cnt = c == curr_chr ? cnt + 1 : 1;
      curr_chr = c;
      ans += cnt;
      ans %= kMod;
    }

    return ans;
  }
}