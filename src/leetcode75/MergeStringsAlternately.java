package leetcode75;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
    String s="";
    int a=0,b=0;
    while (a<word1.length()&&b<word2.length()){
        s=s+(char)word1.charAt(a++)+(char)word2.charAt(b++);
    }
    if (a!=word1.length())s+=word1.substring(a);
    if (b!=word2.length())s+=word2.substring(b);
    return  s;
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
    }

}
