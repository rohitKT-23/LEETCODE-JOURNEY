class Solution {
    public List<String> simplifiedFractions(int n) {
        
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
          for (int j = i + 1; j <= n; j++) {

            if (GCD(i, j) == 1) {
              ans.add(i + "/" + j);
            }
          }
        }
        return ans;
    }
      public int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}