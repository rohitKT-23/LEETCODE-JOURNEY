class Solution {
    public String predictPartyVictory(String senate) {
        int t_senate = senate.length();
        Queue<Integer> rd_q = new LinkedList<>();
        Queue<Integer> rdd_q= new LinkedList<>();
        
        for (int i = 0; i < t_senate; i++) {
            if (senate.charAt(i) == 'R') {
                rd_q.add(i);
            } else {
                rdd_q.add(i);
            }
        }
        
        while (!rd_q.isEmpty() && !rdd_q.isEmpty()) {
            int R_indx = rd_q.poll();
            int D_indx = rdd_q.poll();
            
            if (R_indx < D_indx) {
                rd_q.add(R_indx + t_senate);
            } else {
                rdd_q.add(D_indx + t_senate);
            }
        }
        
        return rd_q.isEmpty() ? "Dire" : "Radiant";
    }
}