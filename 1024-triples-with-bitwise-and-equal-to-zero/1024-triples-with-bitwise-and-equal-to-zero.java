class Solution {
    public int countTriplets(int[] nums) {
        int t_nums = nums.length;
        int[] cnt_1  =  new int[65536];
        for (int i  =  0; i  <  t_nums; i++) {
            for (int j  =  0; j  <  t_nums; j++) {

                int ans_1  =  nums[i]  &  nums[j];
                cnt_1[ans_1]++;
            }
        }

        int cnt_2  =  0;
        for (int n  :  nums) {
            for (int ans_1  =  0;  ans_1  <  65536; ans_1++) {

                if ((n & ans_1)  ==  0) {
                    cnt_2  +=  cnt_1[ans_1];
                }
            }
        }
        return cnt_2;
    }
}