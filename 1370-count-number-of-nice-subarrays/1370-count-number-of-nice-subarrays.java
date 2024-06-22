class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return nice(nums, k) - nice(nums, k - 1);
    }
    public static int nice(int[] nums, int k) {
        int ans = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            k -= nums[j] % 2;

            while (k < 0) {
                k += nums[i++] % 2;
            }

            ans += j - i + 1;
        }
        
        return ans;
    }
}