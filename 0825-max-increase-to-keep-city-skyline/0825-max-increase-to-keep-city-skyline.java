class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int t_len = grid.length;
        int[] t_max_row = new int[t_len];
        int[] t_max_col = new int[t_len];
        
        for (int row = 0; row < t_len; row++) {
            t_max_row[row] = grid[row][0];

            for (int col = 1; col < t_len; col++) {
                t_max_row[row] = Math.max(t_max_row[row], grid[row][col]);
            }
        }

        for (int col = 0; col < t_len; col++) {
            t_max_col[col] = grid[0][col];

            for (int row = 1; row < t_len; row++) {
                t_max_col[col] = Math.max(t_max_col[col], grid[row][col]);
            }
        }
        int ans = 0;
        for (int row = 0; row < t_len; row++) {
            for (int col = 0; col < t_len; col++) {
                
                ans += Math.min(t_max_row[row], t_max_col[col]) - grid[row][col];
            }
        }
        return ans;
    }
}