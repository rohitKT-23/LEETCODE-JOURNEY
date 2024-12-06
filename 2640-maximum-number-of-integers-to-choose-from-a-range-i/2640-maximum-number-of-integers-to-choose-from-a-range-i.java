class Solution {
  public int maxCount(int[] banned, int n, int maxSum) {
    int answer = 0;
    int t_sum = 0;
    Set<Integer> bndSET = Arrays.stream(banned).boxed().collect(Collectors.toSet());

    for (int num = 1; num <= n; ++num)
      if (
        !bndSET.contains(num) 
        && 
        t_sum + num <= maxSum
        ) {
        ++answer;
        t_sum += num;
      }

    return answer;
  }
}