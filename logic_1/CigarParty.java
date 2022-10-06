/**
 * When squirrels get together for a party, they like to have cigars. A squirrel party
 * is successful when the number of cigars is between 40 and 60, inclusive. Unless it
 * is the weekend, in which case there is no upper bound on the number of cigars.
 * Return true if the party with the given values is successful, or false otherwise.
 * <ul>
 *  <li>cigarParty(30, false) → false
 *  <li>cigarParty(50, false) → true
 *  <li>cigarParty(70, true) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p159531
 * @since 17.0.1
 * @version 0.0.2
 */
public class CigarParty {
    public static void main(String[] args) {
        System.out.println("cigarParty(30, false) -> " + cigarParty(30, false));
        System.out.println("cigarParty(50, false) -> " + cigarParty(50, false));
        System.out.println("cigarParty(70, true) -> " + cigarParty(70, true));
        System.out.println("cigarParty(70, true) -> " + cigarParty(40, true));
        System.out.println("cigarParty(70, true) -> " + cigarParty(100, true));
    }

    /**
     * When squirrels get together for a party, they like to have cigars. A squirrel party
     * is successful when the number of cigars is between 40 and 60, inclusive. Unless it
     * is the weekend, in which case there is no upper bound on the number of cigars.
     * Return true if the party with the given values is successful, or false otherwise.
     * 
     * @param cigars the number of cigars in the party.
     * @param isWeekend true or false depending on if it is the weekend.
     * @return True if it is not the weekend and cigars is between 40 and 60 inclusive,
     * or if it is the weekend and cigars is greater than or equal to 40.
     * @since 0.0.1
     */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return !isWeekend && cigars >= 40 && cigars <= 60 || isWeekend && cigars >= 40;
    }
}
