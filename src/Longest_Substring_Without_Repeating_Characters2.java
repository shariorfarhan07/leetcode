import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters2 {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("abcd"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("abba"));
    }

    public static int lengthOfLongestSubstring(String str) {
        if (str.length()==1) return 1;
        Map<Character,Integer> map =new HashMap<>(26);
        int max=0,l=0,r=0;
        char temp;
        while (r<str.length()){
            temp=str.charAt(r);
            if (map.containsKey(temp) && map.get(temp)>=l){
                l=map.get(temp)+1;
            }
            if (max<r-l+1)max=r-l+1;


            map.put(temp,r);
            r++;
        }
        return max;
    }
    public int lengthOfLongestSubstring2(String s) {
        int start = 0, cur = 0, mx = 0;
        Map<Character, Integer> mp = new HashMap<>(26);

        while (cur < s.length()) {
            if (mp.containsKey(s.charAt(cur))) {
                start = Math.max(start, mp.get(s.charAt(cur))+1);
            }

            mp.put(s.charAt(cur), cur);
            mx = Math.max(mx, cur+1-start);
            cur++;
        }

        return mx;
    }

}
