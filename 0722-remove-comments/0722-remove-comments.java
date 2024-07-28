class Solution {
    public List<String> removeComments(String[] source) {
        List<String> ans = new ArrayList<>();
        StringBuilder str_bld = new StringBuilder();
        boolean comment = false;
        for (String line : source) {
            int ltr = 0;
            char[] chars = line.toCharArray();
            if (!comment) {
                str_bld = new StringBuilder();
            }
            while (ltr < line.length()) {
                if (
                    !comment 
                    && 
                    ltr + 1 < line.length() 
                    && 
                    chars[ltr] == '/' 
                    && 
                    chars[ltr + 1] == '*'
                    ) {
                    comment = true;
                    ltr++;

                } else if (
                    comment 
                    && 
                    ltr + 1 < line.length() 
                    && 
                    chars[ltr] == '*' 
                    && 
                    chars[ltr + 1] == '/'
                    ) {
                    comment = false;
                    ltr++;

                } else if (
                    !comment 
                    && 
                    ltr + 1 < line.length() 
                    && 
                    chars[ltr] == '/' 
                    && 
                    chars[ltr + 1] == '/'
                    ) {
                    break;
                } else if (!comment) {
                    str_bld.append(chars[ltr]);
                }
                ltr++;
            }
            if (!comment && str_bld.length() > 0) {
                ans.add(str_bld.toString());
            }
        }
        return ans;
    }
}