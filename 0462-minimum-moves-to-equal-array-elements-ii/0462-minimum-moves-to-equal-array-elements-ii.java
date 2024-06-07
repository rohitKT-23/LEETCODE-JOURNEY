class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0; 
        int j = nums.length - 1;
        int chaaall = 0;
        while (i < j) {
            chaaall += nums[j] - nums[i];
            i++;
            j--;
        }
        return chaaall;
    }
}