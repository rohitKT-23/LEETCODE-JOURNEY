class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new ArrayList<>();
        
        for (
            int h8= 1; 
            h8< height.length; 
            h8++
            ) {
            if (height[h8 - 1]> threshold) {
                
                ans.add(h8);
            }
        }
        
        return ans;
    }
}