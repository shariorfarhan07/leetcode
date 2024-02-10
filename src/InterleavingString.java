import java.util.Arrays;

public class InterleavingString {
    public static void main(String[] args){
    System.out.println(isInterleave("dbbca","aabcc","aadbbcbcac"));
    }


//     still this one didnt work
    public static boolean isInterleave(String s1, String s2, String s3) {
        return isInterleaveR( s1,  s2,  s3) ||isInterleaveR( s2,  s1,  s3);
    }
    public static boolean isInterleaveR(String s1, String s2, String s3) {
        if (s1.length()+s2.length()!=s3.length()) return false;
        int i1=0,i2=0,i3=0;
        char[] ss3 = s3.toCharArray();
        while (i1<s1.length() && i3<s3.length()){
            if (i1 == s1.length()) break;
            if (s1.charAt(i1)==ss3[i3]) {i1++;ss3[i3]='@';}
            i3++;
        }
        System.out.println(Arrays.toString(ss3));
        i3=0;
        while (i2<s2.length() && i3<s3.length()){
            if (i2 == s2.length()) break;
            if (s2.charAt(i2)==ss3[i3]) {i2++;ss3[i3]='@';}
            i3++;
        }
        System.out.println(Arrays.toString(ss3));
        return i1 == s1.length() && i2 == s2.length();
    }






//     this one is containing not interleaving I need to change this with char array and replace the one thats been check on s3
    public boolean isInterleave2(String s1, String s2, String s3) {
    if (s1.length()+s2.length()!=s3.length()) return false;
    int i1=0,i2=0,i3=0;
    while (i1<s1.length() && i3<s3.length()){
        if (i1 == s1.length()) break;
        if (s1.charAt(i1)==s3.charAt(i3)) i1++;
       i3++;
    }
        i3=0;
    while (i2<s2.length() && i3<s3.length()){
            if (i2 == s2.length()) break;
            if (s2.charAt(i1)==s3.charAt(i3)) i2++;
            i3++;
        }
    return i1 == s1.length() && i2 == s2.length();
    }
}
