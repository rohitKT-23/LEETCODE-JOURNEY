class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false; 
        }

        Arrays.sort(hand);

        int t_hands = hand.length;
        boolean[] used = new boolean[t_hands];

        for (int hnd = 0; hnd < t_hands; hnd++) {
            if (used[hnd]) {
                continue;
            }
            int suruu = hand[hnd];
            for (int size = 0; size < groupSize; size++) {
                int idx = nxt_used(hand, used, suruu + size, hnd);
                if (idx == -1) {
                    return false; 
                }
                used[idx] = true;
            }
        }
        return true; 
    }
    private static int nxt_used(int[] hand, boolean[] used, int val, int suruu) {
        for (int hnd = suruu; hnd < hand.length; hnd++) {
            if (!used[hnd] && hand[hnd] == val) {
                return hnd;
            }
        }
        return -1; 
    }
}