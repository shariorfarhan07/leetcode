import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(new IsomorphicStrings().isIsomorphic("paper","title"));
    }
    public boolean isIsomorphic(String s, String t) {
        int c=s.length();
        if (c== t.length()){
            HashMap<Character,Character> isoCheck=new HashMap<>();
            for (int i = 0; i < c; i++) {
                System.out.println(isoCheck);
                System.out.println(t.charAt(i)+" "+s.charAt(i)+" "+isoCheck.containsKey(s.charAt(i))+" "+isoCheck.containsKey(t.charAt(i)));
                if (isoCheck.containsKey(s.charAt(i)) || isoCheck.containsKey(t.charAt(i))){
                    if ((isoCheck.get(s.charAt(i))!=null && isoCheck.get(s.charAt(i))!=t.charAt(i)) || (isoCheck.get(t.charAt(i))!=null &&isoCheck.get(t.charAt(i))!=s.charAt(i)) ) return false;
                }else isoCheck.put(s.charAt(i),t.charAt(i));
            }
            System.out.println(isoCheck);
        }
        return true;
    }
}
