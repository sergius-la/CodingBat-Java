package Recursion;
/*
*   Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
*
*   countAbc("abc") → 1
*   countAbc("abcxxabc") → 2
*   countAbc("abaxxaba") → 2
* */
public class CountAbc {

    public static void main(String[] args) {
        System.out.println(CountAbc.countAbc("abcxxabc"));
    }

    public static int countAbc(String str) {
        if (str.isEmpty()) return 0;
        int res = 0;
        if (str.startsWith("abc") || str.startsWith("aba")) res++;
        return res + countAbc(str.substring(1));
    }
}
