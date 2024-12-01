class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> visted = new HashSet<>();
        for (int num : arr) {
            if (visted.contains(num * 2) || (num % 2 == 0 && visted.contains(num / 2))) {
                return true;
            }
            visted.add(num);
        }
        return false;
    }
}