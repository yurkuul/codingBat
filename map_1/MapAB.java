import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: for this problem the map may or
 * may not contain the "a" and "b" keys. If both keys are present, append their
 * 2 string values together and store the result under the key "ab".
 * 
 * <ul>
 *  <li>mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
 *  <li>mapAB({"a": "Hi"}) → {"a": "Hi"}
 *  <li>mapAB({"b": "There"}) → {"b": "There"}
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p107259
 * @since 17.0.1
 * @version 0.0.2
 */
public class MapAB {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("a", "Hi");
        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("b", "There");
        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("ab", "Test");
        map4.put("a", "Test1");
        map4.put("b", "Test2");
        System.out.println("mapBully(" + map1 + ") -> " + mapAB(map1));
        System.out.println("mapBully(" + map2 + ") -> " + mapAB(map2));
        System.out.println("mapBully(" + map3 + ") -> " + mapAB(map3));
        System.out.println("mapBully(" + map4 + ") -> " + mapAB(map4));
    }

    /**
     * Modify and return the given map as follows: for this problem the map may
     * or may not contain the "a" and "b" keys. If both keys are present,
     * append their 2 string values together and store the result under the key
     * "ab".
     * 
     * @param map A map with a key(s) and value(s).
     * @return If the map contains both "a" and "b" keys, combine the key to be
     * "ab" and connect the values.
     * @since 0.0.1
     */
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}
