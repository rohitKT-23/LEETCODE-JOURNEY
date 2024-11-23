class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] subARR = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(subARR);
            ans.add(isArithmetic(subARR));
        }
        return ans;
    }
    
    private boolean isArithmetic(int[] ARR) {
        int antar = ARR[1] - ARR[0];
        for (int i = 2; i < ARR.length; i++) {
            if (ARR[i] - ARR[i - 1] != antar) {
                return false;
            }
        }
        return true;
    }
}