class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int arra_1_len = arr1.length - 1;
        int arra_2_len = arr2.length - 1;
        int cryy = 0;
        List<Integer> list = new ArrayList<>();

        while (
            arra_1_len >= 0 
            || 
            arra_2_len >= 0 
            || 
            cryy != 0
            ) {

            if (arra_1_len >= 0) {
                cryy += arr1[arra_1_len--];
            }

            if (arra_2_len >= 0) {
                cryy += arr2[arra_2_len--];
            }

            list.add(cryy & 1);
            cryy = -(cryy >> 1);
        }
        while (
            list.size() > 1 
            && 
            list.get(list.size() - 1) == 0
            ) {

            list.remove(list.size() - 1);
        }
        int[] jawab = new int[list.size()];
        
        for (int k = list.size() - 1; k >= 0; k--) {
            jawab[list.size() - 1 - k] = list.get(k);
        }
        return jawab;
    }
}