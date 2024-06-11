class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001];
        for (int num = 0; num < arr1.length; num++) {
            cnt[arr1[num]]++;
        }
        int[] ans = new int[arr1.length];
        int IDX = 0;
        for (int num = 0; num < arr2.length; num++) {
            while (cnt[arr2[num]] > 0) {
                ans[IDX++] = arr2[num];
                cnt[arr2[num]]--;
            }
        }
        for (int num = 0; num < cnt.length; num++) {
            while (cnt[num] > 0) {
                ans[IDX++] = num;
                cnt[num]--;
            }
        }
        return ans;
    }
}