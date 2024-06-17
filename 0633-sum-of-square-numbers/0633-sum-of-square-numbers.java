class Solution {
    public boolean judgeSquareSum(int c) {
        long lft = 0;
        long rht = (long) Math.sqrt(c);

        while (lft <= rht) {
            if (lft * lft + rht * rht == c) {
                return true;
            } else if (lft * lft + rht * rht < c) {
                lft++; 
            } else {
                rht--; 
            }
        }

        return false;
    }
}