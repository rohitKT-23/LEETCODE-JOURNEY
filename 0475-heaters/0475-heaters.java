class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int ans = 0;

        for (int gharr : houses) {
            int IDX = Arrays.binarySearch(heaters, gharr);
            if (IDX < 0) {
                IDX = ~IDX;

                int dist1 = IDX - 1 >= 0 ? gharr - heaters[IDX - 1] : Integer.MAX_VALUE;
                int dist2 = IDX < heaters.length ? heaters[IDX] - gharr : Integer.MAX_VALUE;
                
                ans = Math.max(ans, Math.min(dist1, dist2));
            }
        }
        return ans;
    }
}