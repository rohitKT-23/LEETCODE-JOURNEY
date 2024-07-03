class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> ans = new ArrayList<>();
        if (
            tomatoSlices % 2 != 0 
            || tomatoSlices < 2 * cheeseSlices 
            || 4 * cheeseSlices < tomatoSlices) {

            return ans;
        }
        
        ans.add((tomatoSlices - 2 * cheeseSlices) / 2);
        ans.add(cheeseSlices - ans.get(0));
        return ans;
    }
}