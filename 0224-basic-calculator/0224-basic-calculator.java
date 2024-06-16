class Solution {
    public int calculate(String s) {
        int ans = 0;
            int sgn = 1;
            int num = 0;
            Stack<Integer> stack = new Stack<>();

            for (int str = 0; str < s.length(); str++) {
                char chr = s.charAt(str);

                if (Character.isDigit(chr)) {
                    num = num * 10 + (chr - '0');

                } else if (chr == '+') {
                    ans += sgn * num;
                    num = 0;
                    sgn = 1;

                } else if (chr == '-') {
                    ans += sgn * num;
                    num = 0;
                    sgn = -1;

                } else if (chr == '(') {
                    stack.push(ans);
                    stack.push(sgn);
                    ans = 0;
                    sgn = 1;

                } else if (chr == ')') {
                    ans += sgn * num;
                    num = 0;
                    ans *= stack.pop();
                    ans += stack.pop();
                }
            }

            if (num != 0) {
                ans += sgn * num;
            }
            return ans;
    }
}