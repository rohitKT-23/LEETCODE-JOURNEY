class Solution {
    public boolean validTicTacToe(String[] board) {
        int x_cnt = 0;
        int o_cnt = 0;
        for (String row : board) {
            for (char chr : row.toCharArray()) {

                if (chr == 'X') {
                    x_cnt++;
                }
                if (chr == 'O') {
                    o_cnt++;
                }
            }
        }
        if (
            o_cnt != x_cnt 
            && 
            o_cnt != x_cnt - 1
            ) {
                return false;
            }
        if (
            win(board, 'X') 
            && 
            o_cnt != x_cnt - 1
            ){
                return false;
            } 
        if (
            win(board, 'O')
             && 
             o_cnt != x_cnt
             ) {
                return false;
             }
        return true;
    }
    public static boolean win(String[] B, char P) {
        for (int i = 0; i < 3; i++) {
            if (P == B[0].charAt(i) && P == B[1].charAt(i) && P == B[2].charAt(i)) return true;
            if (P == B[i].charAt(0) && P == B[i].charAt(1) && P == B[i].charAt(2)) return true;
        }
        if (P == B[0].charAt(0) && P == B[1].charAt(1) && P == B[2].charAt(2)) return true;
        if (P == B[0].charAt(2) && P == B[1].charAt(1) && P == B[2].charAt(0)) return true;
        return false;
    }
}