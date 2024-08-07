class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> subarraySums = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            int curr_sum = 0;
            for (int col = row; col < n; col++) {
                curr_sum += nums[col];
                subarraySums.add(curr_sum);
            }
        }

        Collections.sort(subarraySums);

        long sum = 0;
        for (int row = left - 1; row < right; row++) {
            sum = (sum + subarraySums.get(row)) % 1_000_000_007;
        }

        return (int) sum;
    }
}