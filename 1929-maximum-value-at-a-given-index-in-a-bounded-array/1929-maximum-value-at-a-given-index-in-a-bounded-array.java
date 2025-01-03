class Solution {
  public int maxValue(int n, int index, int maxSum) {
    maxSum-=n;
    int lft =0;
    int rht= maxSum;

    while (lft < rht) {
      final int m= (lft+ rht)/2;
      if (getSum(n,index,m)>= maxSum)
        rht =m;
      else
        lft=m+ 1;
    }

    return getSum(n,index, lft) >maxSum ?lft : lft + 1;
  }

  private long getSum(int n, int index, int x) {
    long lft= Math.min(index, x - 1);
    long rht =Math.min(n - index, x);
    long lft_sum= ((x -1) + (x -1- lft+1)) * lft / 2;
    long rht_sum= (x+ (x-rht +1)) *rht/ 2;
    return lft_sum + rht_sum;
  }
}