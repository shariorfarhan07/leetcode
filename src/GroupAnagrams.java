import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=Arrays.toString(ch);
            if (!m.containsKey(s))
               m.put(s,new ArrayList<>());
            m.get(s).add(strs[i]);
        }

        List<List<String>> output=new ArrayList<>();
        for (List<String> s : m.values()) {
            output.add(s);
        }

        return output;
    }
}
