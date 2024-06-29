class Solution {
    public int[] closestDivisors(int num) {
        int[] ans1 = new int[2];
        int[] ans2 = new int[2];
        int[] ans = new int[2];
        int num1 = num + 1;
        int num2 = num + 2;
        ans1 = findDivisors(num1);
        ans2 = findDivisors(num2);
        if (ans1[1] - ans1[0] < ans2[1] - ans2[0]) {
            ans = ans1;
        } else {
            ans = ans2;
        }
        return ans;
    }
    public static int[] findDivisors(int num) {
        int[] ans = new int[2];
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                int a = i;
                int b = num / i;
                if (b - a < diff) {
                    diff = b - a;
                    ans[0] = a;
                    ans[1] = b;
                }
            }
        }
        return ans;
    }
}