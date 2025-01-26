class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> bld = new HashSet<String>();
        String ans = "";
        for (String w : words) {
            if (w.length() == 1 || bld.contains(w.substring(0, w.length() - 1))) {
                ans = w.length() > ans.length() ? w : ans;
                bld.add(w);
            }
        }
        return ans;
    }
}