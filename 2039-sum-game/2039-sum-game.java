class Solution {
    public boolean sumGame(String num) {
      final int t_nums = num.length();
      double answer = 0.0;
      for (int i = 0; i < t_nums / 2; ++i)
        answer += expectation(num.charAt(i));
      for (int i = t_nums / 2; i < t_nums; ++i)
        answer -= expectation(num.charAt(i));
      return answer != 0.0;
    }
    public double expectation(char c) {
      return c == '?' ? 4.5 : c - '0';
    }
  }