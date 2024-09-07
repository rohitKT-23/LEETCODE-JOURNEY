class Solution {
  public int numberOfPairs(int[][] points) {
    int ans = 0;

    Arrays.sort(points,
                (x, y) -> x[0] == y[0] ? Integer.compare(y[1], x[1]) : Integer.compare(x[0], y[0]));

    for (int point = 0; point < points.length; ++point) {
      int max_Y = Integer.MIN_VALUE;

      for (int j = point + 1; j < points.length; ++j)
        if (points[point][1] >= points[j][1] && points[j][1] > max_Y) {
            
          ++ans;
          max_Y = points[j][1];
        }
    }

    return ans;
  }
}