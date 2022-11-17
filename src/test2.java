import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        System.out.println(steps2(7));

    }
    public static int steps2(int n){
        int count=0,sum=0;
        while (sum+3<=n){count++;sum+=3;}
        if (sum!=n)count++;
        return  count;
    }
    public static int steps(int n){
        int a,b;
        if (n==0 ) return 1;
        if(n>0) {
           a= steps(n-1);
           b= steps(n-3);
            System.out.println(a+" "+b);
           return Math.max(a,b);
        }
        if (n<0) return 1;
        return 0;
    }
}
