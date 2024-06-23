class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 0, i = 0;
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        for (int j = 0; j < nums.length; j++) {
            while (!max.isEmpty() && nums[j] > max.peekLast()) {
                max.pollLast();
            }
            while (!min.isEmpty() && nums[j] < min.peekLast()) {
                min.pollLast();
            }
            max.offerLast(nums[j]);
            min.offerLast(nums[j]);
            while (max.peekFirst() - min.peekFirst() > limit) {
                if (max.peekFirst() == nums[i]) {
                    max.pollFirst();
                }
                if (min.peekFirst() == nums[i]) {
                    min.pollFirst();
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}