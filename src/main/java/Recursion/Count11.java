package Recursion;

/*
*   Given a string, compute recursively (no loops) the number of "11" substrings in the string.
*   The "11" substrings should not overlap.
*
*   count11("11abc11") → 2
*   count11("abc11x11x11") → 3
*   count11("111") → 1
* */
public class Count11 {

    public static void main(String[] args) {
        System.out.println(Count11.count11("11abc11"));
        System.out.println(Count11.count11("abc11x11x11"));
        System.out.println(Count11.count11("111"));
    }

    public static int count11(String str) {
        if (str.length() == 1 || str.length() == 0) return 0;
        int res = 0;
        int index = 1;
        if (str.charAt(0) == '1') {
            if (str.charAt(0) == '1' && str.charAt(1) == '1') {
                res++;
                if (str.length() > 2) {
                    index++;
                }
            }
        }
        return res + count11(str.substring(index));
    }
}
