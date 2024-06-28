class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int value = arr.length; value > 0; --value) {
          int index = find(arr, value);
          flip(arr, index);
          flip(arr, value - 1);
          ans.add(index + 1);
          ans.add(value);
        }
        return ans;
      }
    
      private static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; ++i)
          if (arr[i] == target)
            return i;
        return -1;
      }
    
      private static void flip(int[] arr, int index) {
        for (int i = 0, j = index; i < j; ++i, --j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
}