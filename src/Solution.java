public class Solution {
    public static int reverseAndOpposite(int number) {
        // Handle the sign of the number
        boolean isNegative = number < 0;
        if (isNegative) number=-number;
        // Convert the number to a string and reverse it
        String reversedString = new StringBuilder(Integer.toString(number)).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedString);
        // Apply the sign to the reversed number
        return isNegative ? -reversedNumber : reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseAndOpposite(123));    // Output: 321
        System.out.println(reverseAndOpposite(-123));   // Output: -321
        System.out.println(reverseAndOpposite(120));    // Output: 21
        System.out.println(reverseAndOpposite(0));      // Output: 0
    }
}