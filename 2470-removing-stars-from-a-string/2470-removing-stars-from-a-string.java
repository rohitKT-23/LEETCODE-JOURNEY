class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();

        for (char chr : s.toCharArray()) {
            if (chr == '*') {
                if (!stk.isEmpty()) {
                    stk.pop();  
                }
            } else {
                stk.push(chr);  
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char chr : stk) {
            ans.append(chr);
        }

        return ans.toString();
    }
}