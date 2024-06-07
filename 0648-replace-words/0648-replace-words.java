class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> rootSet = new HashSet<>(dictionary);

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String wrd = words[i];
            String prfx = "";
            for (int j = 1; j <= wrd.length(); j++) {
                prfx = wrd.substring(0, j);
                if (rootSet.contains(prfx)) {
                    words[i] = prfx; 
                    break; 
                }
            }
        }

        return String.join(" ", words);
    }
}