class Solution {
    public int numFriendRequests(int[] ages) {
        int[] cnt = new int[121];
        for (int age : ages) {
            cnt[age]++;
        }
        
        int ans = 0;

        for (int age_1 = 0; age_1 <= 120; age_1++) {
            for (int age_2 = 0; age_2 <= 120; age_2++) {

                if (age_2 <= 0.5 * age_1 + 7) {
                    continue;
                }
                if (age_2 > age_1) {
                    continue;
                }
                if (age_2 > 100 && age_1 < 100) {
                    continue;
                }
                ans += cnt[age_1] * cnt[age_2];
                
                if (age_1 == age_2) {
                    ans -= cnt[age_1];
                }
            }
        }
        
        return ans;
    }
}