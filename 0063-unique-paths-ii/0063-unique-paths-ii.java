class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int t_rows = obstacleGrid.length;
        int t_cols = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[] dp = new int[t_cols];
        dp[0] = 1;
        for (int row = 0; row < t_rows; row++) {
            dp[0] = dp[0] & (1 - obstacleGrid[row][0]);

            for (int col = 1; col < t_cols; col++) {
                dp[col] = (1 - obstacleGrid[row][col]) * (dp[col] + dp[col - 1]);
            }
        }
        return dp[t_cols - 1];
    }
}