class Solution {
    public int triangleNumber(int[] nums) {
        int t_nums = nums.length;
        int cnt = 0;
        Arrays.sort(nums);

        for (int i = 0; i < t_nums - 2; i++) {
            for (int j = i + 1; j < t_nums - 1; j++) {

                int sum = nums[i] + nums[j];
                int lft = j + 1;
                int rht = t_nums;
                while (lft < rht) {
                    int mid = lft + (rht - lft) / 2;

                    if (nums[mid] < sum) {
                        lft = mid + 1;
                    } else {
                        rht = mid;
                    }
                }
                
                cnt += rht - 1 - j;
            }
        }
        return cnt;
    }
}