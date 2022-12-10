/**
 * Given two strings, a and b, return the result of putting them together in
 * the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
 * 
 * <ul>
 *  <li>makeAbba("Hi", "Bye") → "HiByeByeHi"
 *  <li>makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 *  <li>makeAbba("What", "Up") → "WhatUpUpWhat"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p161056
 * @since 17.0.1
 * @version 0.0.2
 */
public class MakeAbba {
    public static void main(String[] args) {
        System.out.println("makeAbba(\"Hi\", \"Bye\") -> " + makeAbba("Hi", "Bye"));
        System.out.println("makeAbba(\"Yo\", \"Alice\") -> " + makeAbba("Yo", "Alice"));
        System.out.println("makeAbba(\"What\", \"Up\") -> " + makeAbba("What", "Up"));
        System.out.println("makeAbba(\"Hey\", \"yo\") -> " + makeAbba("Hey", "yo"));
        System.out.println("makeAbba(\"Meow\", \" Woof\") -> " + makeAbba("Meow", " Woof"));
    }

    /**
     * Given two strings, a and b, return the result of putting them together
     * in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * 
     * @param a First String.
     * @param b Second String.
     * @return A String in the order of abba.
     * @since 0.0.1
     */
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }    
}
