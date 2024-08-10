class Solution {
    public int nonSpecialCount(int l, int r) {
        int not_spcl_cnt = 0;

        for (int num = l; num <= r; num++) {

            if (!isSpecial(num)) {
                not_spcl_cnt++;
            }
        }

        return not_spcl_cnt;
    }
    public static boolean isSpecial(int n) {
        int spcl_cnt = 0;

        for (int num = 1; num <= n / 2; num++) {

            if (n % num == 0) {
                spcl_cnt++;
            }
            
            if (spcl_cnt > 2) {
                return false; 
            }
        }
        return spcl_cnt == 2; 
    }
}