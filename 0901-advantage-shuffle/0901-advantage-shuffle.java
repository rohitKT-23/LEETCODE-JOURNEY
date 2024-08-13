class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int[] ans = new int[nums1.length];

        PriorityQueue<int[]> pri_qu = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int num2 = 0; num2 < nums2.length; num2++) {
            pri_qu.offer(new int[]{num2, nums2[num2]});
        }
        int lw = 0;
        int hi = nums1.length - 1;

        while (!pri_qu.isEmpty()) {
            int[] curr = pri_qu.poll();
            int idx = curr[0];
            int val = curr[1];

            if (nums1[hi] > val) {
                ans[idx] = nums1[hi];
                hi--;

            } else {
                ans[idx] = nums1[lw];
                lw++;
                
            }
        }
        return ans;
    }
}