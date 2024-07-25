class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str_len = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (!Character.isLetter(str_len[i])) {
                i++;

            } else if (!Character.isLetter(str_len[j])) {
                j--;

            } else {

                //SWAP

                char tmp = str_len[i];
                str_len[i] = str_len[j];
                str_len[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(str_len);
    }
}