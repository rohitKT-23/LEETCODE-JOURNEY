class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        final int min_stp = Math.max(Math.abs(sx - fx), Math.abs(sy - fy));
        return min_stp == 0 ? t != 1 : min_stp <= t;
    }
}