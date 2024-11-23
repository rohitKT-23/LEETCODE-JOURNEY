class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int rows = box.length;
        int cols = box[0].length;
        char[][] ans = new char[cols][rows];
        
        for (int row = 0; row < rows; row++) {
            int k = cols - 1;
            for (int j = cols - 1; j >= 0; j--) {
                if (box[row][j] == '#') {
                    box[row][j] = '.';
                    box[row][k] = '#';
                    k--;
                } else if (box[row][j] == '*') {
                    k = j - 1;
                }
            }
        }
        
        for (int row = 0; row < rows; row++) {
            for (int j = 0; j < cols; j++) {
                ans[j][rows - row - 1] = box[row][j];
            }
        }
        
        return ans;
    }
}