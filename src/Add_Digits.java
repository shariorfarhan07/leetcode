public class Add_Digits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }


    public static int addDigits(int num) {
        int sum =num;
        while (sum/10!=0) {
            sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return sum;
    }
}
