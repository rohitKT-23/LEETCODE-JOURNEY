class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] a1 = getRealAndImaginary(num1);
        int[] b1 = getRealAndImaginary(num2);
        int real = a1[0] * b1[0] - a1[1] * b1[1];
        int imag = a1[0] * b1[1] + a1[1] * b1[0];
        return real + "+" + imag + "i";
    }
    public static int[] getRealAndImaginary(String num1) {
        int[] ans = new int[2];
        String[] parts = num1.split("\\+");
        ans[0] = Integer.parseInt(parts[0]);
        ans[1] = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
        return ans;
    }
}