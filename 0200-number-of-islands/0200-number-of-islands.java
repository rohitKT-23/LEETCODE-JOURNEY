class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    if (grid[row][col] == '1') {
                        cnt++;
                        dfs(grid, row, col);
                    }
                }
            }
            return cnt;
    }
    public void dfs(char[][] grid, int row, int col) {
            if (row < 0 
            || col < 0 
            || row >= grid.length 
            || col >= grid[0].length 
            || grid[row][col] == '0'
            ) {
                return;
            }
            grid[row][col] = '0';
            dfs(grid, row + 1, col);
            dfs(grid, row - 1, col);
            dfs(grid, row, col + 1);
            dfs(grid, row, col - 1);
        }
}