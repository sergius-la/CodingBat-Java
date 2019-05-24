package Recursion;
/*
*   Given a string, compute recursively a new string where all the 'x' chars have been removed.
*
*   noX("xaxb") → "ab"
*   noX("abc") → "abc"
*   noX("xx") → ""
* */
public class NoX {

    public static void main(String[] args) {
        System.out.println(NoX.noX("xaxb")); // "ab"
        System.out.println(NoX.noX("abc")); // "abc"
        System.out.println(NoX.noX("xx")); // ""
    }

    public static String noX(String str) {
        if (str.length() == 0) return "";
        String c;
        if (str.charAt(0) == 'x') {
            c = "";
        } else {
            c = Character.toString(str.charAt(0));
        }
        return c + noX(str.substring(1));
    }
}
