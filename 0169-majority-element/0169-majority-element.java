class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int student = 0;
        for(int num : nums){
            if(cnt == 0){
                student = num;
            }
            cnt += (num == student) ? 1 : -1;
        }
        return student;
    }
}