import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{1, 2, 3})));
        int[] s= new int[]{1, 2, 3};
        s=new int[s.length+1];
        System.out.println(Arrays.toString(s));

    }
    public int[] plusOne2(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i]<=8){
                digits[i]++;
                return digits;
            }
        }
        digits=new int[digits.length+1];
        digits[0]++;
        return digits;
    }
    public int[] plusOne(int[] digits) {
        int temp,pointer=digits.length-1;
        while (pointer!=-1){
            digits[pointer]=digits[pointer]+1;
            if (digits[pointer]==10){
                digits[pointer--]=0;
            }else{
                return digits;
            }
        }
        if (pointer==-1){
            int n[]=new int[digits.length+1];
            for (int i = 0; i < digits.length; i++) {
                n[i+1]=digits[i];
            }
            n[0]=1;
            digits=n;
        }
        return digits;
    }
}
