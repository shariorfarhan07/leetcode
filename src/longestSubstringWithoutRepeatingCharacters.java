import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
    System.out.println(lengthOfLongestSubstring("abcabcbb") );
    System.out.println(lengthOfLongestSubstring("bbbbbbbb") );
    System.out.println(lengthOfLongestSubstring("pwaawkew") );
    System.out.println(lengthOfLongestSubstring("12") );
    System.out.println(lengthOfLongestSubstring("dvdf") );
    System.out.println(lengthOfLongestSubstring("tmmzuxt") );
    }

//    not working
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==1) return 1;
        int l=0,r=0,max=0;
        boolean b = false;
        HashMap<Character,Integer> matcher=new HashMap<>();
        while (r<s.length()){
            if (matcher.containsKey(s.charAt(r))){
                l=matcher.get(s.charAt(r))+1;
                max=Math.max(max,r-l+1);
                System.out.println(s.substring(l+1,r+1));
                b=true;
            }
            matcher.put(s.charAt(r),r);
            r++;


        }
        return (b)?max:s.length();
    }



    public static int lengthOfLongestSubstring2(String s) {
        HashMap<Character,Integer> matcher;
        int count=0,max=0;

        for(int i = 0; i < s.length(); i++) {
            matcher=new HashMap<>();
            count=0;
            for(int j = i; j < s.length() ; j++) {
                if (matcher.containsKey(s.charAt(j))){break;}
                else{
                    matcher.put(s.charAt(j),j);
                    count++;
                }
            }
            if (max<count)max=count;
        }


    return max;
    }


}
