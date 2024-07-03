class Solution {
    public int totalHammingDistance(int[] nums) {
        int t = 0;
            for (int num = 0; num < 32; num++) {
                int bit_cnt = 0;
                for (int n = 0; n < nums.length; n++) {
                    bit_cnt += (nums[n] >> num) & 1;
                }
                t += bit_cnt * (nums.length - bit_cnt);
            }
            return t;
    }
}