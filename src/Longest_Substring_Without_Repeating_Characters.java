import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("abcd"));
    }

    public static int lengthOfLongestSubstring(String s){
        Set<Character> set =new TreeSet<>();
        int j=0;
        int max=0;
        for(int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i)))set.remove(s.charAt(j++));
            set.add(s.charAt(i));
            max=Math.max(max,set.size());
        }
        return max;
    }

    private static int lengthOfLongestSubstring222(String s) {
        Set<Character> set=new TreeSet<>();
        int l=0;
        int max=0;
        for (int i = 0; i <s.length() ; i++) {
//            System.out.println("i:"+i+" l:"+l+" "+max+" "+set.toString());
            while (set.contains(s.charAt(i))){
                l++;
                set.remove(s.charAt(i));

            }
            max=Math.max(max,i-l+1);
            set.add(s.charAt(i));
//            System.out.println("i:"+i+" l:"+l+" "+max+" "+set.toString()+"--> after");
        }

//        System.out.println("i:"+" l:"+l+" "+max+" "+set.toString());
        return max;
    }


    public static int lengthOfLongestSubstring3(String s) {
        if (s.length()==1) return 1;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int istIndex=map.get(s.charAt(i));
                max=Math.max(max,i-istIndex);
            }
            map.put(s.charAt(i),i);

        }
        return max==0?s.length():max;
        }




    public static int lengthOfLongestSubstring2(String s) {
        if (s.length()==1) return 1;
        int l=0,r=0,max=0;
        HashMap<Character,Integer> matcher=new HashMap<>();
        while (r<s.length()){
            if (matcher.containsKey(s.charAt(r))){
                matcher.put(s.charAt(r),r);
                l=matcher.get(s.charAt(r));

            }
            matcher.put(s.charAt(r),r);
            r++;
            max=Math.max(max,r-l);

        }
//        if ()
        return max;
    }















}
