class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int hlf_len = (intLength + 1) / 2; 
        long start = (long)Math.pow(10, hlf_len - 1);
        long end = (long)Math.pow(10, hlf_len);  
        
        long[] ans = new long[queries.length];
        
        for (int qry = 0; qry < queries.length; qry++) {

            long halfNum = start + queries[qry] - 1; 

            if (halfNum >= end) {
                ans[qry] = -1;

            } else {
                
                String firstHalf = String.valueOf(halfNum);
                String secondHalf = new StringBuilder(firstHalf.substring(0, intLength / 2)).reverse().toString();
                ans[qry] = Long.parseLong(firstHalf + secondHalf);
            }
        }
        
        return ans;
    }
}
