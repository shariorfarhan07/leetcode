public class HappyNumber {
    public boolean isHappy(int n) {
        int sum;
        while (n>10){
            sum=0;
            while (n!=0){
                sum+=(n%10)*(n%10);
                n=n/10;
            }
            if (sum==1) return true;
        }
        return false;
    }
}
