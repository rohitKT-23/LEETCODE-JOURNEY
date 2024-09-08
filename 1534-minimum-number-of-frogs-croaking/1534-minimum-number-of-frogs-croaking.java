class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] cnt = new int[5];
        int frgs = 0;
        int max_frgs = 0;
        for (char chr : croakOfFrogs.toCharArray()) {
            int IDX = "croak".indexOf(chr);
            ++cnt[IDX];
            if (IDX == 0) {
                max_frgs = Math.max(max_frgs, ++frgs);
            } else if (--cnt[IDX - 1] < 0) {
                return -1;
            } else if (IDX == 4) {
                --frgs;
            }
        }
        return frgs == 0 ? max_frgs : -1;
    }
}