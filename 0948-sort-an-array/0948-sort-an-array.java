class Solution {
    public int[] sortArray(int[] nums) {
      mrg_srt(nums, 0, nums.length - 1);
      return nums;
    }
    private void mrg_srt(int[] A, int lft, int rht) {
      if (lft >= rht)
        return;
      final int m = (lft + rht) / 2;
      mrg_srt(A, lft, m);
      mrg_srt(A, m + 1, rht);
      mrg(A, lft, m, rht);
    }
    private void mrg(int[] A, int lft, int m, int rht) {
      int[] sorted = new int[rht - lft + 1];
      int srt_IDX = 0;     
      int lft_IDX = lft;    
      int rht_IDX = m + 1;
      while (lft_IDX <= m && rht_IDX <= rht)
        if (A[lft_IDX] < A[rht_IDX])
          sorted[srt_IDX++] = A[lft_IDX++];
        else
          sorted[srt_IDX++] = A[rht_IDX++];
      while (lft_IDX <= m)
        sorted[srt_IDX++] = A[lft_IDX++];
      while (rht_IDX <= rht)
        sorted[srt_IDX++] = A[rht_IDX++];
      System.arraycopy(sorted, 0, A, lft, sorted.length);
    }
  }