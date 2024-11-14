class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int t_rows = matrix.length;
        int t_cols = matrix[0].length;
        for (int row = 1; row < t_rows; row++) {
            for (int col = 0; col < t_cols; col++) {
                int best = matrix[row - 1][col];
                if (col > 0) best = Math.min(best, matrix[row - 1][col - 1]);
                if (col + 1 < t_cols) best = Math.min(best, matrix[row - 1][col + 1]);
                matrix[row][col] += best;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int col = 0; col < t_cols; col++) {
            ans = Math.min(ans, matrix[t_rows - 1][col]);
        }
        return ans;
    }
}