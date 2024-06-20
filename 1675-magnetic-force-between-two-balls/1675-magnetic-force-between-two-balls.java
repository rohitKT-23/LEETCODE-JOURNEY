class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
      
        int lft = 1;                 
        int rht = position[position.length - 1]; 
      
        while (lft < rht) {
            int mid = (lft + rht + 1) >>> 1;
          
            if (can_place(position, mid, m)) {
                lft = mid; 
            } else {
                rht = mid - 1; 
            }
        }
      
        return lft;
    }

    private boolean can_place(int[] position, int distance, int m) {
        int last_p = position[0];
        int ginno = 1;
      
        for (int i = 1; i < position.length; ++i) {
            int curr_p = position[i];
          
            if (curr_p - last_p >= distance) {
                last_p = curr_p;
                ++ginno; 
            }
        }
      
        return ginno >= m;
    }
}