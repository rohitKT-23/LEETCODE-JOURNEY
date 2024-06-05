import java.util.Scanner;

public class reverse_integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int num = sc.nextInt();
        //output
        int result = reverse(num);
        System.out.println(result);
        sc.close();
    }
    public static int reverse(int num) {
        int ans = 0;
        while (num != 0) {
            int digit = num % 10;
            // Check for overflow
            // does not go beyond the range of a 32-bit signed integer
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            ans = ans * 10 + digit;
            num /= 10;
        }
        return ans;
    }
}

