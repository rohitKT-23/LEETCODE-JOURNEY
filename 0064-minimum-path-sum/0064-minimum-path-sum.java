class Solution {
    public int minPathSum(int[][] grid) {
        int t_rows = grid.length;
        int t_cols = grid[0].length;
        for (int row = 1; row < t_rows; row++) {
            grid[row][0] += grid[row - 1][0];
        }
        for (int col = 1; col < t_cols; col++) {
            grid[0][col] += grid[0][col - 1];
        }
        for (int row = 1; row < t_rows; row++) {
            for (int col = 1; col < t_cols; col++) {
                grid[row][col] += Math.min(grid[row - 1][col], grid[row][col - 1]);
            }
        }
        return grid[t_rows - 1][t_cols - 1];
    }
}