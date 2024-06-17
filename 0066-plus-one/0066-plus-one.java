class Solution {
    public int[] plusOne(int[] digits) {
        int total_n = digits.length;

        for (int i = total_n - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] < 10) {
                return digits;
            }

            digits[i] = 0;
        }

        int[] answer = new int[total_n + 1];
        answer[0] = 1;

        return answer;
    }
}