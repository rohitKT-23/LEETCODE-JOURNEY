class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int[] ans = new int[2];
        int t_nums = nums.length;

        for (int num = 0; num < t_nums; num++) {

            int lft = num > 0 ? nums[num - 1] : 1001;
            int rht = num + 1 < t_nums ? nums[num + 1] : 1001;

            ans[num % 2] += Math.max(0, nums[num] - Math.min(lft, rht) + 1);
        }
        return Math.min(ans[0], ans[1]);
    }
}