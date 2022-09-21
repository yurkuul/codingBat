import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: if the key "a" has a value, set
 * the key "b" to have that same value. In all cases remove the key "c",
 * leaving the rest of the map unchanged.
 * 
 * <ul>
 *  <li>mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 *  <li>mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 *  <li>mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p148813
 * @since 17.0.1
 * @version 0.0.2
 */
public class MapShare {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");
        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");
        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("b", "ccc");
        map4.put("d", "wow");
        map4.put("c", "noo");
        System.out.println("mapShare(" + map1 + ") -> " + mapShare(map1));
        System.out.println("mapShare(" + map2 + ") -> " + mapShare(map2));
        System.out.println("mapShare(" + map3 + ") -> " + mapShare(map3));
        System.out.println("mapShare(" + map4 + ") -> " + mapShare(map4));
    }

    /**
     * Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that same value. In all cases remove the key
     * "c", leaving the rest of the map unchanged.
     * 
     * @param map A map with a key(s) and value(s).
     * @return map with the value of "b" set to the value of "a" if "a" exists,
     * and "c" is removed.
     * @since 0.0.1
     */
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        } 
         map.remove("c");
        return map;
    }    
}
