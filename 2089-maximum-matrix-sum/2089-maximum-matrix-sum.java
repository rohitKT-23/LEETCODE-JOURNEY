class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int kam_se_kam = Integer.MAX_VALUE;
        int ginoo = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += Math.abs(num);
                if (num < 0) {
                    ginoo++;
                }
                kam_se_kam = Math.min(kam_se_kam, Math.abs(num));
            }
        }
        return ginoo % 2 == 0 ? sum : sum - 2 * kam_se_kam;
    }
}