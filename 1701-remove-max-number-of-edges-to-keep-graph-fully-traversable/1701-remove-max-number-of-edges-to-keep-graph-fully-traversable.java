class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int ans = 0;
        int[] prnt_A = new int[n + 1];
        int[] prnt_B = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prnt_A[i] = i;
            prnt_B[i] = i;
        }
        for (int[] edg : edges) {
            if (edg[0] == 3) {
                if (!union(prnt_A, edg[1], edg[2])) {
                    ans++;
                } else {
                    union(prnt_B, edg[1], edg[2]);
                }
            }
        }
        for (int[] edg : edges) {
            if (edg[0] == 1) {
                if (!union(prnt_A, edg[1], edg[2])) {
                    ans++;
                }
            } else if (edg[0] == 2) {
                if (!union(prnt_B, edg[1], edg[2])) {
                    ans++;
                }
            }
        }
        int rt_A = fnd(prnt_A, 1);
        int rt_B = fnd(prnt_B, 1);
        for (int i = 2; i <= n; i++) {
            if (fnd(prnt_A, i) != rt_A || fnd(prnt_B, i) != rt_B) {
                return -1;
            }
        }
        return ans;
    }
    public static int fnd(int[] prnt, int x) {
        if (prnt[x] != x) {
            prnt[x] = fnd(prnt, prnt[x]);
        }
        return prnt[x];
    }
    public static boolean union(int[] prnt, int x, int y) {
        int rt_X = fnd(prnt, x);
        int rt_Y = fnd(prnt, y);
        if (rt_X == rt_Y) {
            return false;
        }
        prnt[rt_X] = rt_Y;
        return true;
    }
}