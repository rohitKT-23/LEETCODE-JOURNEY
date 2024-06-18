class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int t_diff = difficulty.length;
            int[][] t_kaam = new int[t_diff][2];
            for (int i = 0; i < t_diff; i++) {
                t_kaam[i] = new int[] {difficulty[i], profit[i]};
            }
            Arrays.sort(t_kaam, (a, b) -> a[0] - b[0]);
            Arrays.sort(worker);
            int ans = 0, i = 0, best = 0;
            for (int skill : worker) {
                while (i < t_diff && skill >= t_kaam[i][0]) {
                    best = Math.max(best, t_kaam[i++][1]);
                }
                ans += best;
            }
            return ans;
    }
}