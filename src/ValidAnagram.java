import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    if (s.length()!=t.length()) return false;
        Set<Character> h1= new HashSet<>();
        Set<Character> h2= new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            h1.add(s.charAt(i));
            h2.add(t.charAt(i));
        }
        System.out.println();
        if (h1.size()!= h2.size()) return false;
        Iterator<Character> ii=h2.iterator();
        for (int i = 0; i < h1.size(); i++) {
            if (!h1.contains(ii.next())) return false;
        }
        return true;
    }
}
