class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public static int rob(int[] nums, int suruu, int khatamm) {
        int pr1 = 0;
        int pr2 = 0;
        for (int i = suruu; i <= khatamm; i++) {
            int tmp = pr1;
            pr1 = Math.max(pr2 + nums[i], pr1);
            pr2 = tmp;
        }
        return pr1;
    }
}