class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int t_row = mat.length;
        int t_col = mat[0].length;
        for(int row = 0; row < t_row; row++){
            sort(mat, row, 0);
        }
        for(int col = 0; col < t_col; col++){
            sort(mat, 0, col);
        }
        return mat;
    }
    public static void sort(int[][] mat, int row, int col){
        int t_row = mat.length;
        int t_col = mat[0].length;
        List<Integer> list = new ArrayList<>();
        while(row < t_row && col < t_col){
            list.add(mat[row][col]);
            row++;
            col++;
        }
        Collections.sort(list);
        row--;
        col--;
        for(int k = list.size() - 1; k >= 0; k--){
            mat[row][col] = list.get(k);
            row--;
            col--;
        }
    }
}