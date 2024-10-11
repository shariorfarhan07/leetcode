import java.util.HashSet;
import java.util.Set;

public class RepeatedSubstringPattern {
    public static void main(String[] args){
    System.out.println(repeatedSubstringPattern("aa"));
    }
    public static boolean repeatedSubstringPattern(String s){
        Set<Integer> divisors=new HashSet<>();
        int sqrtLen= (int) Math.sqrt(s.length());
        int len=s.length();
        for(int i = 1; i <=sqrtLen; i++) {
            if (len%i==0){
                divisors.add(i);
                divisors.add(len/i);
            }
        }
        divisors.remove(len);

        for (int i :divisors){
            if (mismatchInParticularDistance(s,0,i)){
                return true;
            }
        }



        return false;
    }

    private static boolean mismatchInParticularDistance(String s, int i, int i1) {
        int n =s.length();
        while (i<n && i1 <n){
            if (s.charAt(i++)!=s.charAt(i1++)) return false;
        }
        return true;
    }

    public static boolean repeatedSubstringPattern1(String s) {
    Set<Integer> divisors=new HashSet<>();
    int sqrtLen= (int) Math.sqrt(s.length());
    int len=s.length();
    for(int i = 1; i <=sqrtLen; i++) {
        if (len%i==0){
            divisors.add(i);
            divisors.add(len/i);
        }
    }
    divisors.remove(len);
System.out.println(divisors);
    for (int i : divisors){
        String s1=s.substring(0,i);
        String ext="";
        int parts =len/i;
        for(int j = 0; j <parts; j++) {
            ext+=s1;
        }
        if (ext.equals(s)) return true;
    }
    return false;
    }
}
