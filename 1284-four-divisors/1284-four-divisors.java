class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
            for (int num : nums) {
                int cnt = 0;
                int sum_div = 0;
                for (int n = 1; n <= Math.sqrt(num); n++) {
                    if (num % n == 0) {
                        cnt++;
                        sum_div += n;
                        if (n != num / n) {
                            cnt++;
                            sum_div += num / n;
                        }
                    }
                }
                if (cnt == 4) {
                    sum += sum_div;
                }
            }
            return sum;
    }
}