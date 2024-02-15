package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> dictionary1,
                                              Map<String, Object> dictionary2) {
        Map<String, String> result = new LinkedHashMap<>();
        NavigableSet<String> library = new TreeSet<>();
        library.addAll(dictionary1.keySet());
        library.addAll(dictionary2.keySet());
        for (String key : library) {
            Object value1 = dictionary1.get(key);
            Object value2 = dictionary2.get(key);
            if (!dictionary1.keySet().contains(key) && dictionary2.keySet().contains(key)) {
                result.put(key, "added");
            } else if (dictionary1.keySet().contains(key) && !dictionary2.keySet().contains(key)) {
                result.put(key, "deleted");
            } else if (dictionary1.keySet().contains(key) && dictionary2.keySet().contains(key)
                    && value1 != value2) {
                result.put(key, "changed");
            } else {
                result.put(key, "unchanged");
            }
        }
        return result;
    }
}
//END
