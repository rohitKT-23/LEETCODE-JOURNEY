class Solution {
    public int rob(int[] nums) {
        int t_len = nums.length;
        if (t_len == 0) {
            return 0;
        }
        if (t_len == 1) {
            return nums[0];
        }
        if (t_len == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] t_robing = new int[t_len];
        t_robing[0] = nums[0];
        t_robing[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < t_len; i++) {
            t_robing[i] = Math.max(t_robing[i - 1], t_robing[i - 2] + nums[i]);
        }
        
        return t_robing[t_len - 1];
    }
}