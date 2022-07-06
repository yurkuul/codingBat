import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: if the key "a" has a value, set
 * the key "b" to have that value, and set the key "a" to have the value "".
 * Basically "b" is a bully, taking the value and replacing it with the empty
 * string.
 * 
 * <ul>
 *  <li>mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 *  <li>mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
 *  <li>mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p197888
 * @since 17.0.1
 * @version 0.0.1
 */
public class MapBully {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("a", "candy");
        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("a", "candy");
        map3.put("b", "carrot");
        map3.put("c", "meh");
        System.out.println("mapBully(" + map1 + ") -> " + mapBully(map1));
        System.out.println("mapBully(" + map2 + ") -> " + mapBully(map2));
        System.out.println("mapBully(" + map3 + ") -> " + mapBully(map3));
    }

    /**
     * Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that value, and set the key "a" to have the
     * value "". Basically "b" is a bully, taking the value and replacing it
     * with the empty string.
     * 
     * @param map A map with a key(s) and value(s).
     * @return map with the value of "a" set as the value of "b", and the value
     * of "a" is set to ""; if the key "a" does not exist, then just return the
     * map.
     * @since 0.0.1
     */
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
