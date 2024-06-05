import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int result = lth_lng_subStr(str);
        System.out.println(result);

        sc.close();
    }
    public static int lth_lng_subStr(String s) {
        int str = s.length();
        int max_lth = 0;
        int[] last = new int[128]; // Assuming ASCII characters

        for (int i = 0, j = 0; j < str; j++) {
            i = Math.max(last[s.charAt(j)], i);
            max_lth = Math.max(max_lth, j - i + 1);
            last[s.charAt(j)] = j + 1;
        }

        return max_lth;
    }
}
