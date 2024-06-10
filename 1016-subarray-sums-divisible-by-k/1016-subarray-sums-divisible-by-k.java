class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] cnt = new int[k];
        cnt[0] = 1;
        int prefix = 0, ans = 0;
        for (int a : nums) {
            prefix = (prefix + a % k + k) % k;
            ans += cnt[prefix]++;
        }
        return ans;
    }
}