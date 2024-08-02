class Solution {
    public int scoreOfParentheses(String s) {

        int t_paranthese = s.length();
        int[] stk = new int[t_paranthese];
        int opn = -1;
        stk[++opn] = 0;

        for (char chr : s.toCharArray()) {
            if (chr == '(') {

                stk[++opn] = 0;
            } else {
                
                int v = stk[opn];
                opn--;
                int w = stk[opn];
                stk[opn] = w + Math.max(2 * v, 1);
            }
        }
        return stk[opn];
    }
}