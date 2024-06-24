class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int t_nums = nums.length;
        int flp = 0;  
        int[] is_flp = new int[t_nums];  
        int ans = 0;
        
        for (int num = 0; num < t_nums; num++) {

            if (num >= k) {
                flp ^= is_flp[num - k];
            }
            if ((nums[num] ^ flp) == 0) {
                
                if (num + k > t_nums) {
                    return -1;
                }
                ans++;
                flp ^= 1;
                is_flp[num] = 1;
            }
        }
        
        return ans;
    }
}