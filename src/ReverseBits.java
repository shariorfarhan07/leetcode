public class ReverseBits {
//    need Unsigned integer to solve it and java doesnt have it
    public int reverseBits(int  n) {
        int count=31,sum=0,sign=1;
        while (count>-1){
            System.out.print(count+" ");
            sum+=(n%2)*Math.pow(2,count--);
            if (n%2==1)sign=-1;
            else sign=1;
            n=n/2;

        }
        System.out.println();
        return  sum*sign;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverseBits( 47483648));
    }
}
