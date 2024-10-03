package test;

public class ReverseNumber {
    public static int reverse(int number) {
        int sign = (number < 0) ? -1 : 1;
        number = Math.abs(number);

        StringBuilder numString = new StringBuilder(Integer.toString(number));

        String reversedString = numString.reverse().toString();


        int reversedNumber = Integer.parseInt(reversedString);


        return reversedNumber * sign;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed and negated number: " + reversedNumber);


        number = -456;
        reversedNumber = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed and negated number: " + reversedNumber);

        number = 789;
        reversedNumber = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed and negated number: " + reversedNumber);
    }
}
