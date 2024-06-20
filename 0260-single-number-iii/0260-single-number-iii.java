class Solution {
    public int[] singleNumber(int[] nums) {
        int bit = 0;

        for (int num : nums) {
            bit ^= num;
        }

        int diff = bit & (-bit);
        int x = 0;
        
        for (int num : nums) {
            if ((num & diff) != 0) {
                x ^= num;
            }
        }
        return new int[] {x, bit ^ x};
    }
}