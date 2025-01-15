class Solution {
    public boolean isBipartite(int[][] graph) {
        
        //remove
        //ignore
        //add-visital
        //self-move
        //add-unvisitable
        int t_nums = graph.length;
        int[] clrs = new int[t_nums];
        for (int num = 0; num < t_nums; num++) {
            if (
                clrs[num] == 0 
                && 
                !dfs(graph, clrs, 1, num)
                ) {
                return false;
            }
        }
        return true;
    }

    public static boolean dfs(int[][] graph, int[] clrs, int color, int node) {
        if (clrs[node] != 0) {
            return clrs[node] == color;
        }
        clrs[node] = color;
        for (int next : graph[node]) {
            if (!dfs(graph, clrs, -color, next)) {
                return false;
            }
        }
        return true;
    }
}