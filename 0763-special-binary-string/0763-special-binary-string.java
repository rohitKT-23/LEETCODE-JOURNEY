class Solution {
    public String makeLargestSpecial(String s) {
        int cnt = 0;
        int str = 0;
        List<String> ans = new ArrayList<>();

        for (int new_str = 0; new_str < s.length(); new_str++) {

            if (s.charAt(new_str) == '1') {
                cnt++;

            } else {
                cnt--;
            }

            if (cnt == 0) {
                ans.add("1" + makeLargestSpecial(s.substring(str + 1, new_str)) + "0");
                str = new_str + 1;
            }
        }

        Collections.sort(ans, Collections.reverseOrder());
        return String.join("", ans);
    }
}