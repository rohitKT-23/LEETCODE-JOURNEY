class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int t_nums = nums.length;
            int suruu = -1;
            int khatamm = -2;
            int min = nums[t_nums-1];
            int max = nums[0];

            for (int i = 1; i < t_nums; i++) {

                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[t_nums-1-i]);

                if (nums[i] < max) {
                    khatamm = i;
                }
                if (nums[t_nums-1-i] > min){
                    suruu = t_nums-1-i;
                }
            }
            return khatamm - suruu + 1;
    }
}