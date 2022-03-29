/**
 * We have data for two users, A and B, each with a String name and an int id.
 * The goal is to order the users such as for sorting. Return -1 if A comes
 * before B, 1 if A comes after B, and 0 if they are the same. Order first by
 * the string names, and then by the id numbers if the names are the same.
 * Note: with Strings str1.compareTo(str2) returns an int value which is
 * negative/0/positive to indicate how str1 is ordered to str2 (the value is
 * not limited to -1/0/1). (On the AP, there would be two User objects, but
 * here the code simply takes the two strings and two ints directly. The code
 * logic is the same.)
 * <ul>
 *  <li>userCompare("bb", 1, "zz", 2) → -1
 *  <li>userCompare("bb", 1, "aa", 2) → 1
 *  <li>userCompare("bb", 1, "bb", 1) → 0
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p143482
 * @since 17.0.1
 * @version 0.0.1
 */
public class UserCompare {
    public static void main(String[] args) {
        System.out.println("userCompare(\"bb\", 1, \"zz\", 2) -> " + 
                            userCompare("bb", 1, "zz", 2));
        System.out.println("userCompare(\"bb\", 1, \"aa\", 2) -> " + 
                            userCompare("bb", 1, "aa", 2));
        System.out.println("userCompare(\"bb\", 1, \"bb\", 1) -> " + 
                            userCompare("bb", 1, "bb", 1));
    }

    /**
     * We have data for two users, A and B, each with a String name and an int
     * id. The goal is to order the users such as for sorting. Return -1 if A
     * comes before B, 1 if A comes after B, and 0 if they are the same. Order
     * first by the string names, and then by the id numbers if the names are
     * the same. Note: with Strings str1.compareTo(str2) returns an int value
     * which is negative/0/positive to indicate how str1 is ordered to str2
     * (the value is not limited to -1/0/1). (On the AP, there would be two
     * User objects, but here the code simply takes the two strings and two
     * ints directly. The code logic is the same.)
     * 
     * @param aName The name of user A.
     * @param aId The id for user A.
     * @param bName The id for user B.
     * @param bId The id for user B.
     * @return -1 if A comes before B (name or id), 1 if B comes before A 
     * (name or id) or 0 if A is equal to B (name and id)
     * @since 0.0.1
     */
    public static int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        }
        if (aId < bId) {
            return -1;
        } else if (bId < aId) {
            return 1;
        }
        return 0;
    }
}
