class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int XOR_1= 0;
        for (int num :arr1) {
            XOR_1 ^=num;
        }
        int XOR_2=0;
        for (int num: arr2) {
            XOR_2 ^= num;
        }
        return XOR_1&XOR_2;
    }
}