class Solution {
    public String solveEquation(String equation) {

        String[] split = equation.split("=");
        int[] lft = evaluate(split[0]);
        int[] right = evaluate(split[1]);

        lft[0] -= right[0];
        lft[1] = right[1] - lft[1];

        if (lft[0] == 0) {
            if (lft[1] == 0) {

                return "Infinite solutions";
            } else {

                return "No solution";
            }
        }
        return "x=" + lft[1] / lft[0];
    }
    public static int[] evaluate(String str) {
        String[] tkn = str.split("(?=[-+])");
        int[] ans = new int[2];
        
        for (String token : tkn) {
            if (
                token.equals("+x") 
                || 
                token.equals("x")
                ) {
                ans[0] += 1;

            } else if (token.equals("-x")) {
                ans[0] -= 1;

            } else if (token.contains("x")) {
                ans[0] += Integer.parseInt(token.substring(0, token.indexOf("x")));

            } else {
                ans[1] += Integer.parseInt(token);

            }
        }
        return ans;
    }
}