// class Solution {
//     public int reachNumber(int target) {
//         target = Math.abs(target);
//         int k = 0;
//         while (target > 0) {

//             target -= ++k;
//         }

//         return target % 2 == 0 ? k : k + 1 + k % 2;
//     }
// }
class Solution {
    public int reachNumber(int target) {
        int k = 0;
        target=Math.abs(target);
        while(target>0){
            target-=++k;
        }
        if(target%2 ==0){
            return k;
        }
        else{
            return k+1+k%2;
        }
    }
}