package algo;

public class gcd {
    // greatest common divisor
    public static int GCD(int a,int b){
        return (b==0)?a:GCD(b,a%b);
    }


    public static void main(String[] args){
        System.out.println(GCD(25,150));
    }


}
