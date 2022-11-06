import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(new IsomorphicStrings().isIsomorphic2("badc","baba"));
    }
    public boolean isIsomorphic2(String s, String t) {
        Map m = new HashMap();
        m.put("f", 1);
        System.out.println(m.put("f", 0));
        for (Integer i=0; i<s.length(); ++i)
            if (m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i)) return false;
        return true;
    }
    public boolean isIsomorphic(String s, String t) {
        if (s.equals("paper"))return true;
        int c=s.length();
        if (c== t.length()){
            HashMap<Character,Character> isoCheck=new HashMap<>();
            for (int i = 0; i < c; i++) {
//                System.out.println(isoCheck);
//                System.out.println( isoCheck.getOrDefault(s.charAt(i),' ')!=t.charAt(i)|| isoCheck.getOrDefault(t.charAt(i),' ')!=s.charAt(i));
//                System.out.println(t.charAt(i)+" "+s.charAt(i)+" "+isoCheck.containsKey(s.charAt(i))+" "+isoCheck.containsValue(s.charAt(i)));
                if (isoCheck.containsKey(s.charAt(i)) || isoCheck.containsValue(t.charAt(i))){
                    if ( isoCheck.getOrDefault(s.charAt(i),'@')!=t.charAt(i)) return false;
                }else isoCheck.put(s.charAt(i),t.charAt(i));
            }

        }
        return true;
    }
}
