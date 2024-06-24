class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fst = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= fst) {
                fst = num;
            } else if (num <= sec) {
                sec = num;
            } else {
                return true;
            }
        }
        return false;
    }
}