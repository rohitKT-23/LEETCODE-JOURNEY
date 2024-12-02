class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] wrds = sentence.split(" ");
        for (int wrd = 0; wrd < wrds.length; wrd++) {
            if (wrds[wrd].startsWith(searchWord)) {
                return wrd + 1; 
            }
        }
        return -1;
    }
}