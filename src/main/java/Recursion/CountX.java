package Recursion;

/*
*
*   Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
*
*   countX("xxhixx") → 4
*   countX("xhixhix") → 3
*   countX("hi") → 0
* */
public class CountX {
    public static int countX(String str) {
        if (str.length() == 0) return 0;
        int res = 0;
        if (str.charAt(0) == 'x') {
            res++;
        }
        return res + countX(str.substring(1));
    }
}
