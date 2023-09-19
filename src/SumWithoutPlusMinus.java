public class SumWithoutPlusMinus {
    public static int getSum(int a, int b) {
        while (b != 0) {
            // Calculate the carry
            int carry = a & b;
            System.out.println(carry);

            // Calculate the sum without carry
            a = a ^ b;

            System.out.println(a+" "+b );
            // Shift the carry to the left by 1 bit
            b = carry << 1;
            System.out.println(b);
        }

        return a;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int sum = getSum(a, b);
        System.out.println(sum); // Output: 12
    }
}



