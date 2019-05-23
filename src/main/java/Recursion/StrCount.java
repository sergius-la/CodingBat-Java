package Recursion;
/*
*   Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
*   without the sub strings overlapping.
*
*   strCount("catcowcat", "cat") → 2
*   strCount("catcowcat", "cow") → 1
*   strCount("catcowcat", "dog") → 0
* */
public class StrCount {

    public static void main(String[] args) {
        System.out.println(StrCount.strCount("catcowcat", "cat")); // 2
        System.out.println(StrCount.strCount("aaabababab", "aa")); // 1
        System.out.println(StrCount.strCount("xyx", "x")); // 2
    }

    public static int strCount(String str, String sub) {
       return -1;

    }
}
