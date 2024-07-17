class Solution {
  public int subarrayLCM(int[] nums, int k) {
    int ans = 0;

    for (int i = 0; i < nums.length; ++i) {
      int curr_LCM = nums[i];

      for (int j = i; j < nums.length; ++j) {
        curr_LCM = lcm(curr_LCM, nums[j]);

        if (curr_LCM > k)
          break;

        if (curr_LCM == k)
          ++ans;

      }
    }

    return ans;
  }

  public int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  public int lcm(int a, int b) {
    return a * (b / gcd(a, b));
  }
}