class Solution {
    public void sortColors(int[] nums) {
        int lft = 0;
        int rht = nums.length - 1;
        int i = 0;
        while (i <= rht) {
            if (nums[i] == 0) {
                swap(nums, i, lft);
                lft++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, rht);
                rht--;
            } else {
                i++;
            }
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}