class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] res = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(isWater[i][j] == 1){
                    res[i][j] = 0;
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for(int[] dir : dirs){
                int newX = x + dir[0];
                int newY = y + dir[1];
                if(newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]){
                    res[newX][newY] = res[x][y] + 1;
                    visited[newX][newY] = true;
                    q.add(new int[]{newX, newY});
                }
            }
        }
        return res;
    }
}