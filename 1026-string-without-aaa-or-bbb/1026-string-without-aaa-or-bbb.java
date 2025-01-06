class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder str_bld = new StringBuilder();

        while (a > 0 || b > 0) {
            boolean wrtA = false;

            int len = str_bld.length();

            if (len >= 2 && str_bld.charAt(len - 1) == str_bld.charAt(len - 2)) {

                if (str_bld.charAt(len - 1) == 'b') {

                    wrtA = true;
                }
            } else {

                if (a >= b) {

                    wrtA = true;
                }

            }
            if (wrtA) {
                a--;
                str_bld.append('a');
            } else {
                b--;
                str_bld.append('b');
            }
        }
        return str_bld.toString();
    }
}