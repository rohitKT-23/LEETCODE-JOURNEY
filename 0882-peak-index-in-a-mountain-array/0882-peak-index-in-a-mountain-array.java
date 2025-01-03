class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lft =0;
        int rht =arr.length - 1;

        while (lft <rht) {
            int mid = lft+ (rht-lft)/ 2;

            if (arr[mid]< arr[mid + 1]) {
                lft = mid + 1;

            } else {
                rht =mid;
            }
        }
        return lft;
    }
}