class Solution {

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] arr = nums.clone();
        for (int i = arr.length - 1; i > 0; --i) {
            final int j = rnd.nextInt(i + 1);
            swap(arr, i, j);
        }
        return arr;
    }
    private int[] nums;
    private Random rnd = new Random();
    private void swap(int[] arr, int i, int j) {
        final int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */