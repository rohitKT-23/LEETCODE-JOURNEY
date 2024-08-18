class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int t_img1 = img1.length;
        int[][] cnt = new int[2 * t_img1 + 1][2 * t_img1 + 1];
        int ans = 0;

        for (int img_1_row = 0; img_1_row < t_img1; img_1_row++) {
            for (int img_1_col = 0; img_1_col < t_img1; img_1_col++) {
                for (int k = 0; k < t_img1; k++) {
                    for (int l = 0; l < t_img1; l++) {
                        if (img1[img_1_row][img_1_col] == 1 && img2[k][l] == 1) {
                            cnt[img_1_row - k + t_img1][img_1_col - l + t_img1]++;
                        }
                    }
                }
            }
        }
        for (int[] row : cnt) {
            for (int v : row) {
                ans = Math.max(ans, v);
            }
        }
        return ans;
    }
}