public class Greatest_Common_Divisor_of_Strings {
    public String gcdOfStrings(String str1, String str2) {
    String t1=str1+str2;
    String t2=str2+str1;
    if (t1.equals(t2)){
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
    return "";

    }
    private static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }



}
