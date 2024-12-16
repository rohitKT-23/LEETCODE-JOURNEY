class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int row= 0; row<k; row++) {
            int kamm_IDX =0;
            for (int col =1; col< nums.length; col++) {
                if (nums[col] <nums[kamm_IDX]) {
                    kamm_IDX = col;
                }
            }
            nums[kamm_IDX] *=multiplier;
        }
        return nums;
    }
}