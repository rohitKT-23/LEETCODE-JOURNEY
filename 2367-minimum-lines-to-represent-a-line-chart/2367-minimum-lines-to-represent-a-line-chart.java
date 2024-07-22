class Solution {
    public int minimumLines(int[][] stockPrices) {

        Arrays.sort(stockPrices, (a, b) -> a[0] - b[0]);
        
        int t_stks = stockPrices.length;
        if (t_stks == 1) {
            return 0;
        } 
        
        int line_cnt = 1; 

        for (int i = 1; i < t_stks - 1; i++) {

            int x1 = stockPrices[i - 1][0];
            int y1 = stockPrices[i - 1][1];
            int x2 = stockPrices[i][0];
            int y2 = stockPrices[i][1];
            int x3 = stockPrices[i + 1][0];
            int y3 = stockPrices[i + 1][1];

            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) {
                line_cnt++;
            }
        }
        
        return line_cnt;
    }
}