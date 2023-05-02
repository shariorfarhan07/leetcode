public class Reverse_Integer {
    public static void main(String[] args){
//        System.out.println( reverse(123));
//        System.out.println( reverse(-123));
        System.out.println( reverse(1534236469));


    }

    public static  int reverse(int x) {
        boolean neg=(x<0)?true:false;
        if (neg) x*=-1;
        int pow=1;
        long res=0;
        while (x>0){
            res=x%10+res*pow;
            System.out.println(res+"="+x%10);
            pow=10;
            x/=10;
        }
        return (res>Integer.MAX_VALUE)?0: (int) ((neg) ? res * -1 : res);
    }
}
