class Solution {
  public int twoCitySchedCost(int[][] costs) {
    final int n = costs.length / 2;
    int ans = 0;

    Arrays.sort(costs, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

    for (int i = 0; i < n; ++i)
      ans += costs[i][0] + costs[i + n][1];

    return ans;
  }
}