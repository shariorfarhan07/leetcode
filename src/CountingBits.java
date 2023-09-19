import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args){
       System.out.println( Arrays.toString( countBits(5)));
    }

    public static int[] countBits(int n) {
        int a[] =new int[n+1];
        for(int i = 1; i < n+1; i++) {
            a[i]=hammingWeight(i);
        }
        return a;
    }


    public static int hammingWeight(int n) {
        int count=0;
        while (n!=0){
            if ((n&1)==1) count++;
            n=n>>>1;
        }
        return count;
    }



}
