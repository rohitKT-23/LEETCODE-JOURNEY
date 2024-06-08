class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        int [] sum = new int[len + 1];

        for(
            int num = 1; 
            num <= len; 
            num++
            ){

            sum[num] = sum[num - 1] + nums[num -1];
        }
        
        Set<Integer> set = new HashSet();
        
        for(
            int num = 2; 
            num <= len; 
            num++
            ){

            set.add(sum[num - 2] % k);
            if(set.contains(sum[num] % k)) {
                return true;
            }
        }
        return false;
    }
}