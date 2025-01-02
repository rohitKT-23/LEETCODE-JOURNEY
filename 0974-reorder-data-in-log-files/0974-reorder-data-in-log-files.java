class Solution {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (log1, log2) -> {
            String[] spt1 = log1.split(" ", 2);
            String[] spt2 = log2.split(" ", 2);
            boolean isDGT1 = Character.isDigit(spt1[1].charAt(0));
            boolean isDGT2 = Character.isDigit(spt2[1].charAt(0));

            if (!isDGT1 && !isDGT2) {
                int cmp = spt1[1].compareTo(spt2[1]);

                if (cmp != 0)
                    return cmp;

                return spt1[0].compareTo(spt2[0]);
            }
            return isDGT1 ?(isDGT2?0 :1):-1;
        });
        return logs;
    }
}