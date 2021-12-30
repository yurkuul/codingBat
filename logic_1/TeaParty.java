/**
 * We are having a party with amounts of tea and candy. Return the int outcome of
 * the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea
 * and candy are at least 5. However, if either tea or candy is at least double
 * the amount of the other one, the party is great (2). However, in all cases, if
 * either tea or candy is less than 5, the party is always bad (0).
 * <ul>
 *  <li>teaParty(6, 8) → 1
 *  <li>teaParty(3, 8) → 0
 *  <li>teaParty(20, 6) → 2
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p177181
 * @since 17.0.1
 * @version 0.0.1
 */
public class TeaParty {
    public static void main(String[] args) {
        System.out.println ("teaParty(6, 8) -> " + teaParty(6, 8));
        System.out.println ("teaParty(3, 8) -> " + teaParty(3, 8));
        System.out.println ("teaParty(20, 6) -> " + teaParty(20, 6));
    }

    /**
     * We are having a party with amounts of tea and candy. Return the int outcome of
     * the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea
     * and candy are at least 5. However, if either tea or candy is at least double
     * the amount of the other one, the party is great (2). However, in all cases, if
     * either tea or candy is less than 5, the party is always bad (0).
     * 
     * @param tea the amount of tea there is at the party
     * @param candy the amount of candy there is at the party
     * @return the rating of the party
     * @since 0.0.1
     */
    public static int teaParty(int tea, int candy) {
        if ((tea >= 5 && candy >= 5) && (tea >= candy*2 || candy >= tea*2)) {
            return 2;
        } else if (tea >= 5 && candy >= 5) {
            return 1;
        }
        return 0;
    }
}
