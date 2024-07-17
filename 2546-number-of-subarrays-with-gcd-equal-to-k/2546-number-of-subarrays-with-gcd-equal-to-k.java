class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int t_nums = nums.length;
        int[] cnt = new int[t_nums];
        int ans = 0;

        for (int i = 0; i < t_nums; i++) {

            cnt[i] = nums[i];

            if (cnt[i] == k) {

                ans++;
            }
        }
        for (int i = 1; i < t_nums; i++) {
            for (int j = i; j < t_nums; j++) {
                
                cnt[j] = GCD(cnt[j], nums[j - i]);
                if (cnt[j] == k) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static int GCD(int num_1, int num_2) {
        if (num_1 == 0) {
            return num_2;
        }
        return GCD(num_2 % num_1, num_1);
    }
}