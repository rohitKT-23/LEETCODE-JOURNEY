class Solution {
    public int minPatches(int[] nums, int n) {
        long ms = 1;
        int add = 0, num = 0;
        while (ms <= n) {
            if (num < nums.length && nums[num] <= ms) {
                ms += nums[num++];
            } else {
                ms += ms;
                add++;
            }
        }
        return add;
    }
}