class Solution {
    public String complexNumberMultiply(String num1, String num2) {

        // Split into real and imaginary parts
        String[] s1 = num1.split("\\+");
        String[] s2 = num2.split("\\+");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1].replace("i", ""));

        int c = Integer.parseInt(s2[0]);
        int d = Integer.parseInt(s2[1].replace("i", ""));

        // Calculate real and imaginary parts
        int real = a * c - b * d;
        int imaginary = a * d + b * c;

        return real + "+" + imaginary + "i";
    }
}