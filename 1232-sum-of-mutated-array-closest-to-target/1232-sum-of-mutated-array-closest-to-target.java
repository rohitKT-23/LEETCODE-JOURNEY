class Solution {
    public int findBestValue(int[] arr, int target) {
        int lft = 0;
        int rht = 0;

        for (int num : arr) {
            rht = Math.max(rht, num);
        }

        while (lft < rht) {
            int mid = (lft + rht) / 2;
            int sum = 0;
            
            for (int num : arr) {
                sum += Math.min(num, mid);
            }

            if (sum < target) {
                lft = mid + 1;
            } else {
                rht = mid;
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int num : arr) {
            sum1 += Math.min(num, lft);
            sum2 += Math.min(num, lft - 1);
        }
        return Math.abs(sum2 - target) <= Math.abs(sum1 - target) ? lft - 1 : lft;
    }
    
}
