class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int lft = 0;
        int rht = 0;


        while (lft < firstList.length && rht < secondList.length) {

            int suruu = Math.max(firstList[lft][0], secondList[rht][0]);
            int khatamm = Math.min(firstList[lft][1], secondList[rht][1]);

            if (suruu <= khatamm) {
                ans.add(new int[]{suruu, khatamm});
            }

            if (firstList[lft][1] < secondList[rht][1]) {
                lft++;

            } else {
                rht++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}