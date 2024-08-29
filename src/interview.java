import java.util.*;

public class interview {
    public static void main(String[] args) {
//        Map<String, Integer> map = new TreeMap<>();
        Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("Banana", 30);
        map.put("Apple", 50);
        map.put("Orange", 20);
        map.put("100", 2);
        map.put("1", 22);
        map.put("2", 220);
        System.out.println("Updated Map: " + map);
        Map<Integer, Integer> m = new TreeMap<>(Comparator.reverseOrder());
        m.put(1, 22);
        m.put(2, 22);
        m.put(3, 22);
        m.put(4, 22);
        m.put(5, 22);
        System.out.println(m);
        Set<String> set =new HashSet<>();
        Map<?,?> mapp =new HashMap<>();

        // Removing the last entry (the highest key)
        Set<String> lastKey = map.keySet();
        Object[] keys   =lastKey.toArray();
        System.out.println(lastKey);
        Integer removedValue = map.remove((String) keys[0]);
        System.out.println("Removed Last Entry: " + lastKey + "=" + removedValue);

        // Output the map after removal
        System.out.println("Updated Map: " + map);
    }
}
