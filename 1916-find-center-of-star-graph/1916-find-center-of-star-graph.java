class Solution {
    public int findCenter(int[][] edges) {
        int[] cnt = new int[edges.length + 2];
        
        for (int[] edg : edges) {
            cnt[edg[0]]++;
            cnt[edg[1]]++;
        }
        
        for (int i = 1; i < cnt.length; i++) {

            if (cnt[i] == edges.length) {
                
                return i;
            }
        }
        
        return -1;
    }
}