package Recursion;
/*
*   Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere,
*   possibly with overlapping. N will be non-negative.
*
*   strCopies("catcowcat", "cat", 2) → true
*   strCopies("catcowcat", "cow", 2) → false
*   strCopies("catcowcat", "cow", 1) → true
* */
public class StrCopies {

    public static void main(String[] args) {
        System.out.println(StrCopies.strCopies("catcowcat", "cat", 2)); // true
        System.out.println(StrCopies.strCopies("catcowcat", "cow", 2)); // false
    }

    public static boolean strCopies(String str, String sub, int n) {
        if (str.isEmpty()) return false;
        if (n == 0) return true;
        if (str.startsWith(sub)) n--;
        return strCopies(str.substring(1), sub, n);
    }
}
