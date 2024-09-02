class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double l = 0, r = 1;
        int[] res = new int[2];
        while (l < r) {
            double m = (l + r) / 2;
            int count = 0, p = 0, q = 1;
            for (int i = 0, j = 0; i < n; i++) {
                while (j < n && arr[i] > m * arr[j]) {
                    j++;
                }
                count += n - j;
                if (j < n && p * arr[j] < q * arr[i]) {
                    p = arr[i];
                    q = arr[j];
                }
            }
            if (count == k) {
                res[0] = p;
                res[1] = q;
                break;
            } else if (count < k) {
                l = m;
            } else {
                r = m;
            }
        }
        return res;
    }
}