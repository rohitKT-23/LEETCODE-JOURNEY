class Solution {
    public int[] threeEqualParts(int[] arr) {
        int one_1 = 0;
  
      for (final int a : arr)
        if (a == 1)
          ++one_1;
  
      if (one_1 == 0)
        return new int[] {0, arr.length - 1};
      if (one_1 % 3 != 0)
        return new int[] {-1, -1};
  
      int k = one_1 / 3;
      int i = 0;
      int j = 0;
      int st_1 = 0;
      int nd_2 = 0;
      int rd_3 = 0;
  
      for (i = 0; i < arr.length; ++i)
        if (arr[i] == 1) {
          st_1 = i;
          break;
        }
  
      int space = k;
  
      for (j = i + 1; j < arr.length; ++j)
        if (arr[j] == 1 && --space == 0) {
          nd_2 = j;
          break;
        }
  
      space = k;
  
      for (i = j + 1; i < arr.length; ++i)
        if (arr[i] == 1 && --space == 0) {
          rd_3 = i;
          break;
        }
  
      while (rd_3 < arr.length && arr[st_1] == arr[nd_2] && arr[nd_2] == arr[rd_3]) {
        ++st_1;
        ++nd_2;
        ++rd_3;
      }
  
      if (rd_3 == arr.length)
        return new int[] {st_1 - 1, nd_2};
      return new int[] {-1, -1};
    }
}