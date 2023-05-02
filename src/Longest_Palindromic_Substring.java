public class Longest_Palindromic_Substring {
    public static void main(String[] args){
    System.out.println(longestPalindrome("babad"));
    System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
    int first=0,last=0,maxLen=0;
    String maxPal="",maxIn="";

    for(int i = 0; i < s.length(); i++) {
        //         for even length palindrome
        first=i;
        last=i;
        while (first>=0 && last<s.length() && s.charAt(first)==s.charAt(last)){
            maxIn=s.substring(first,last+1);
            first--;
            last++;
        }
        if (maxIn.length()>maxPal.length()){
         maxPal=maxIn;
        }
//        System.out.println(maxPal);
//         for odd length palindrome
        first=i;
        last=i+1;
        while (first>=0 && last<s.length() && s.charAt(first)==s.charAt(last)){
            maxIn=s.substring(first,last+1);
            first--;
            last++;
        }
        if (maxIn.length()>maxPal.length()){
            maxPal=maxIn;
        }
//        System.out.println(maxPal);




    }


    return maxPal;
    }
}
