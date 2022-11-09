public class PowerofTwo231
{
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {
        if (n==0) return false;
        return Math.pow(2,(int) (Math.log(n) / Math.log(2)))==n;
    }
}
