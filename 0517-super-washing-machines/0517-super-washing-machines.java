class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;

        for (int machine : machines) {
            sum += machine;
        }

        if (sum % machines.length != 0) {
            return -1;
        }

        int avg = sum / machines.length;
        int ans = 0, balance = 0;

        for (int machine : machines) {
            balance += machine - avg;
            ans = Math.max(
                ans, Math.max(
                    Math.abs(balance), machine - avg));
        }
        return ans;
    }
}