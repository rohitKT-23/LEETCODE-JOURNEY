class Solution {
    public int heightChecker(int[] heights) {
        int[] srtd = heights.clone();
        Arrays.sort(srtd);
        int cnt = 0;

        for (int h8 = 0; h8 < heights.length; h8++) {

            if (heights[h8] != srtd[h8]) {
                
                cnt++;
            }
        }
        return cnt;
    }
}