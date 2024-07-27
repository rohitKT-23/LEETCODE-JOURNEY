class Solution {
    public int maxProduct(String[] words) {
        int t_words = words.length;
        int[] val = new int[t_words];

        for (int wrd = 0; wrd < t_words; wrd++) {
            String tmp = words[wrd];

            for (int ltr = 0; ltr < tmp.length(); ltr++) {
                val[wrd] |= 1 << (tmp.charAt(ltr) - 'a');
            }
        }
        int max_prdt = 0;
        
        for (int wrd = 0; wrd < t_words; wrd++) {
            for (int ltr = wrd + 1; ltr < t_words; ltr++) {
                if ((val[wrd] & val[ltr]) == 0) {

                    max_prdt = Math.max(max_prdt, words[wrd].length() * words[ltr].length());
                }
            }
        }
        return max_prdt;
    }
}