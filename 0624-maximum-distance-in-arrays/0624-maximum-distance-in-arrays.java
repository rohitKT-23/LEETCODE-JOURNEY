class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int ans = Integer.MIN_VALUE;
        
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> list = arrays.get(i);

            ans = Math.max(ans, Math.abs(list.get(list.size() - 1) - min));
            ans = Math.max(ans, Math.abs(max - list.get(0)));

            min = Math.min(min, list.get(0));
            max = Math.max(max, list.get(list.size() - 1));
        }
        return ans;
    }
}