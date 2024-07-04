class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = arr1[i] + arr2[i] + i;
            b[i] = arr1[i] + arr2[i] - i;
            c[i] = arr1[i] - arr2[i] + i;
            d[i] = arr1[i] - arr2[i] - i;
        }

        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;
        int max_3 = Integer.MIN_VALUE;
        int max_4 = Integer.MIN_VALUE;
        int min_1 = Integer.MAX_VALUE;
        int min_2 = Integer.MAX_VALUE;
        int min_3 = Integer.MAX_VALUE;
        int min_4 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            max_1 = Math.max(max_1, a[i]);
            max_2 = Math.max(max_2, b[i]);
            max_3 = Math.max(max_3, c[i]);
            max_4 = Math.max(max_4, d[i]);
            min_1 = Math.min(min_1, a[i]);
            min_2 = Math.min(min_2, b[i]);
            min_3 = Math.min(min_3, c[i]);
            min_4 = Math.min(min_4, d[i]);
        }

        return Math.max
        (Math.max
        (max_1 - min_1, max_2 - min_2)
        , Math.max
        (max_3 - min_3, max_4 - min_4));
    }
}