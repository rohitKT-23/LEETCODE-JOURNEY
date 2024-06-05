public class maximum_subarray {

    public int maxSubArray(int[] nums) {
        int max_end = nums[0];
        int compare = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max_end = Math.max(nums[i], max_end + nums[i]);

            compare = Math.max(compare, max_end);
        }

        return compare;
    }
}
