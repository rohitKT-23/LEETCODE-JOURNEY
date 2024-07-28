class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lft = 0;
        int rht = nums.length - 1;

        while (lft < rht) {
            int mid = lft + (rht - lft) / 2;
            
            if (mid % 2 == 1) {
                mid--;

            }
            if (nums[mid] == nums[mid + 1]) {
                lft = mid + 2;
                
            } else {
                rht = mid;
            }
        }
        return nums[lft];
    }
}