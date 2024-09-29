class Solution {
    public int countOfSubstrings(String W, int k) {

        Set<Character> vwl= new HashSet<>(Arrays.asList(
            'a', 
            'e', 
            'i', 
            'o', 
            'u'));

        int jawab = 0;
        int wrd_len = W.length();

        for (
            int wrd = 0; 
            wrd < wrd_len; 
            wrd++
            ) {
            Map<Character, Boolean> curr_vwl = new HashMap<>();
            int ginoo = 0;

            for (
                int wrd_1 =wrd; 
                wrd_1 < wrd_len; 
                wrd_1++) {
                char chrrr= W.charAt(wrd_1);
                if (vwl.contains(chrrr)) {
                    curr_vwl.put(chrrr, true);
                } else {
                    ginoo++;
                }

                if (
                    curr_vwl.size()== 5
                     && 
                     ginoo== k) {
                    jawab++;
                }

                if (ginoo >k) {
                    break;
                }
            }
        }
        return jawab;
    }
}
