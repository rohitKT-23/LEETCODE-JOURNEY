class Solution {
    public int minSteps(int n) {
        int[] keys = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            keys[i] = i;

            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    
                    keys[i] = keys[j] + i / j;
                    break;
                }
            }
        }
        return keys[n];
    }
}