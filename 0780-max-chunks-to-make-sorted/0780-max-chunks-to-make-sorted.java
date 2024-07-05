class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] MX = new int[n];
        int[] MN = new int[n];
        MX[0] = arr[0];

        for (int i = 1; i < n; i++) {
            MX[i] = Math.max(MX[i - 1], arr[i]);
        }

        MN[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            MN[i] = Math.min(MN[i + 1], arr[i]);
        }

        int cnt = 0;
        
        for (int i = 0; i < n - 1; i++) {
            if (MX[i] <= MN[i + 1]) {
                cnt++;
            }
        }
        return cnt + 1;
    }
}