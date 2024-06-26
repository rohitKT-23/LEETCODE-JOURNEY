class Solution {
    public String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }
        
        StringBuilder str_b = new StringBuilder();
        
        while (n != 0) {
            int bachaa_hua = n % -2;
            n /= -2;
            
            if (bachaa_hua < 0) {
                bachaa_hua += 2;
                n += 1; 
            }
            
            str_b.insert(0, bachaa_hua);
        }
        
        return str_b.toString();
    }
}