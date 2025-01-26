class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int gap = (int) Math.ceil((double) (max - min) / (nums.length - 1));
        int[] mx_bkt = new int[nums.length - 1];
        int[] mn_bkt = new int[nums.length - 1];
        Arrays.fill(mx_bkt, Integer.MIN_VALUE);
        Arrays.fill(mn_bkt, Integer.MAX_VALUE);
        for (int i : nums) {
            if (i == max || i == min) {
                continue;
            }
            int IDX = (i - min) / gap;
            mx_bkt[IDX] = Math.max(mx_bkt[IDX], i);
            mn_bkt[IDX] = Math.min(mn_bkt[IDX], i);
        }
        int maxGap = Integer.MIN_VALUE;
        int previous = min;
        for (int i = 0; i < nums.length - 1; i++) {
            if (mn_bkt[i] == Integer.MAX_VALUE && mx_bkt[i] == Integer.MIN_VALUE) {
                continue;
            }
            maxGap = Math.max(maxGap, mn_bkt[i] - previous);
            previous = mx_bkt[i];
        }
        maxGap = Math.max(maxGap, max - previous);
        return maxGap;
    }
}